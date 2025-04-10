package RemoveDuplicatesFromSortedArray;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArraySolution
{
	public static void main(String[]args)
	{
		int[]array = {1, 1, 2};
		removeDuplicates(array);
	}
	public static int removeDuplicates(int[]nums)
	{
		Set<Integer> hashSet = new HashSet<>();		
		for(int i = 0; i < nums.length; i++)
			hashSet.add(nums[i]);

		Integer[] array = new Integer[hashSet.size()];

		hashSet.toArray(array);

		for(Integer i : array)
			System.out.println(i);

		return hashSet.size();
	}
}
