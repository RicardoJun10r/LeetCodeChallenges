package AddDigits;

public class AddDigitsNumbers {
    public static void main(String[] args) {
        System.out.println(addDigits(38)); // Output: 2
        System.out.println(addDigits(0));  // Output: 0
        System.out.println(addDigits(123)); // Output: 6
        System.out.println(addDigits(9999)); // Output: 9
    }

    static int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + (num - 1) % 9;
    }
}
