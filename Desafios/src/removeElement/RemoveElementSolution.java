package removeElement;

public class RemoveElementSolution {

	public static int removeElement(int[] nums, int val) {
		int size = nums.length;
		int count = 0;
		int[] temp = new int[nums.length];
		for (int i = 0; i < size; i++) {
			if (nums[i] != val) {
				temp[count] = nums[i];
				count++;
			}
		}
		for (int i = 0; i < count; i++) {
			nums[i] = temp[i];
		}
		return count;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 2, 2, 3 };
		int val = 3;
		int newSize = removeElement(nums, val);

		for (int i = 0; i < newSize; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
}
