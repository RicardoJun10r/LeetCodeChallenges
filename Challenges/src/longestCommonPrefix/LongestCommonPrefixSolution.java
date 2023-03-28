
public class LongestCommonPrefixSolution
{
	public static void main(String[]args)
	{
		String[] strs = {"ab","a"};
		System.out.println(longestCommonPrefix(strs));	
	}

	public static String longestCommonPrefix(String[] palavras){
		boolean flag = true;
		int cont = 0;
		int size = shortestLength(palavras);
		while(flag){
			char vez = palavras[0].charAt(cont);
			for(int i = 0; i < palavras.length; i++){
				if(vez != palavras[i].charAt(cont)){
					flag = false;
				}
			}
			if(flag)
				cont++;
		}
		return palavras[0].substring(0, cont);
	}

	// public String longestCommonPrefix(String[] palavras) {
    //     if(palavras[0].equals("")) return "";
    //     String res = "";
    //     char vez;
    //     boolean prefix = true;
    //     int size = shortestLength(palavras);
    //     int cont = 0;
    //     while(cont < size) {
    //         vez = palavras[0].charAt(cont);
    //         for(int j = 0; j < palavras.length; j++){
    //             if(vez != palavras[j].charAt(cont)){
    //                 prefix = false;
    //             } 
    //         }
    //         if(prefix)
    //             res += palavras[0].charAt(cont);
    //         cont++;
    //     }  
    //     return res;
    // }

    public static int shortestLength(String[]palavras){
        int size = palavras[0].length();
        for(int i = 0; i < palavras.length; i++){
            if(size > palavras[i].length()){
                size = palavras[i].length();
            }
        }
        return size;
    }
}
