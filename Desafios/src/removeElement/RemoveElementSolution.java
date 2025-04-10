public class RemoveElementSolution{
	
	public static void main(String[] args)
	{
		int[]nums = {3, 2, 2, 3};
		
		System.out.println("Resposta: " + removeElement(nums, 3));
	}

	public static int removeElement(int[] nums, int val)
	{
		int soma = 0;
		String numeros = "";
		int[]res = new int[nums.length];

		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i] != val)
			{
				soma++;
				numeros += nums[i];
			}
		}
		
		for(int i = 0; i < numeros.length(); i++)
		{
			res[i] = Integer.parseInt(charToString(numeros.charAt(i)));
		}
		for(int i = 0; i < res.length; i++)
			System.out.println(res[i]);
		return soma;
	}
	public static String charToString(char c)
	{
		String conversor = "";

		conversor += c;

		return conversor;
	}
}
