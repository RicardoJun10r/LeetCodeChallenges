package singleNumber;

import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int result = singleNumber(new int[] { 2, 2, 1 });
        System.out.println(result);
    }

    static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new java.util.HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
