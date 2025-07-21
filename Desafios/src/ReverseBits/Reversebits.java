package ReverseBits;

public class Reversebits {
    public static void main(String[] args) {
        int n = 43261596;
        // int n = 45;
        reverseBits(n);
    }

    static int reverseBits(int n) {
        int result = n;
        String binario = "";
        while (result != 0) {
            binario += (result % 2);
            result /= 2;
        }
        StringBuilder sb = new StringBuilder(binario);
        sb.reverse();
        binario = sb.toString();
        while (binario.length() < 32) {
            binario = "0" + binario;
        }
        sb = new StringBuilder(binario);
        sb.reverse();
        String binario_inverso = sb.toString();
        int decimal = 0;
        int potencia = 0;
        for (int i = binario_inverso.length() - 1; i >= 0; i--) {
            if (binario_inverso.charAt(i) == '1') {
                decimal += ((int) Math.pow(2, potencia));
            }
            potencia++;
        }
        return decimal;
    }

}
