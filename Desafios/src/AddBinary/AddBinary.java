package AddBinary;

public class AddBinary {

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int soma = carry;
            if (i >= 0) {
                soma += a.charAt(i) - '0';
            }
            if (j >= 0) {
                soma += b.charAt(j) - '0';
            }
            if (soma == 0 || soma == 1) {
                result.append(soma);
                carry = 0;
            } else if (soma == 2) {
                result.append("0");
                carry = 1;
            } else {
                result.append("1");
                carry = 1;
            }
            i--;
            j--;
        }

        if (carry == 1) {
            result.append("1");
        }

        return result.reverse().toString();
    }

}
