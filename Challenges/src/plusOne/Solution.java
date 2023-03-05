public class Solution
{
	public static void main(String[]args)
	{
		int[]digits = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		plusOne(digits);
		System.out.println();
	}

	public static int[] plusOne(int[] digits)
	{
        
		String numeros = "";
		for(int i = 0; i < digits.length; i++)
			numeros += digits[i];

		Long resultado = Long.valueOf(numeros) + 1;

		numeros = resultado.toString();
		int[]res = new int[numeros.length()];

		for(int i = 0; i < numeros.length(); i++)
			res[i] = asciiToInt(numeros.charAt(i));

		return res;
    }

	public static int asciiToInt(char ch)
	{
		switch(ch)
		{
			case 48:
				return 0;
			case 49:
				return 1;
			case 50:
				return 2;
			case 51:
				return 3;
			case 52:
				return 4;
			case 53:
				return 5;
			case 54:
				return 6;
			case 55:
				return 7;
			case 56:
				return 8;
			case 57:
				return 9;
			default:
				return 0;
		}
	}
}
