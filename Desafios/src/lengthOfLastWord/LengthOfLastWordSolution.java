package lengthOfLastWord;
public class LengthOfLastWordSolution
{
	public static int lengthOfLastWord(String s)
	{
		String[]vetor;
		vetor = s.split(" ");
		
		int size = vetor[vetor.length-1].length();
		return size;
	}
}
