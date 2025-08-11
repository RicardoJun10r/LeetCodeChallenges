package HappyNumber;

public class HappyNum {

    public static void main(String[] args) {
        int n = 103;
        if (isHappy(n)) {
            System.out.println(n + " is a happy number.");
        } else {
            System.out.println(n + " is not a happy number.");
        }
    }

    static int somaDosQuadrados(int n) {
        int soma = 0;
        while (n > 0) {
            int digito = n % 10;
            soma += digito * digito;
            n /= 10;
        }
        return soma;
    }

    static boolean isHappy(int n) {
        int tartaruga = n, lebre = n;
        do{
            tartaruga = somaDosQuadrados(tartaruga);
            lebre = somaDosQuadrados(somaDosQuadrados(lebre));
        } while(tartaruga != lebre);
        return tartaruga == 1;
    }
}