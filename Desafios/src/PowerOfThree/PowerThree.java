package PowerOfThree;

public class PowerThree {
    public static void main(String[] args) {
        int n = 27; // Example input
        if (isPowerOfThree2(n)) {
            System.out.println(n + " is a power of three.");
        } else {
            System.out.println(n + " is not a power of three.");
        }
    }

    static boolean isPowerOfThree(int n) {
        if (n == 0)
            return false;
        double res = Math.log(n) / Math.log(3);
        return Math.abs(res - Math.round(res)) < 1e-10;
    }

    static boolean isPowerOfThree2(int n) {
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}
