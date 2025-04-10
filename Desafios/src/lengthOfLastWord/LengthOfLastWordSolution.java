public class LengthOfLastWordSolution
{
	public static void main(String[]args)
	{
		String s = "   fly me   to   the moon  ";
		
		System.out.println(lengthOfLastWord(s));
	}

	public static int lengthOfLastWord(String s)
	{
		String[]vetor;
		vetor = s.split(" ");
		
		int size = vetor[vetor.length-1].length();
		return size;
	}
}
