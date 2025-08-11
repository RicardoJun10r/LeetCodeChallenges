package MissingNumber;

public class MissingNum {
    public static void main(String[] args) {
        int[] nums = { 3, 0, 1 };
        System.out.println("O número que falta é: " + missingNumber(nums));
    }

    static int missingNumber(int[] nums) {
        int n = nums.length;
        int soma_total = n * (n + 1) / 2;
        int soma = 0;
        for (int i : nums) {
            soma += i;
        }
        return soma_total - soma;
    }
}
