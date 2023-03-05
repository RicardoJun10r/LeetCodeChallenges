public class Solution{
	
	public static void main(String[]args)
	{
		String s = "()[]";
		if(isValid(s)) 
			System.out.println("True");
		else
			System.out.println("False");
	}
	public static boolean isValid(String s){

		boolean resposta = true;
		
		int size = s.length();

		int contador = 0;

		if(size%2 != 0)
		{
			return false;
		}

		int j;
		while(contador < size)
		{
			for(int i = 0; i < s.length(); i++)
			{
				j =(i+1)%size;
				if(s.charAt(i) == '(')
				{
					if(s.charAt(j) != ')')
					{
						resposta = false;
						break;
					}
					else
					{
						break;
					}
				}
				if(s.charAt(i) == '[')
				{
					if(s.charAt(j) != ']')
					{
						resposta = false;
						break;
					}
					else
					{
						break;
					}
				}
				if(s.charAt(i) == '{')
				{
					if(s.charAt(j) != '}')
					{
						resposta = false;
						break;
					}
					else
					{
						break;
					}
				}
			}
			contador++;
		}
		return resposta;
	}
}
