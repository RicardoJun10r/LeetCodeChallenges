public class ZigZagConversionSolution
{
	public static void main(String[]args)
	{
		convert("PAYPALISHIRING", 3);
	}

	public static void convert(String s, int numRows) {

		int cont = 0;
		int numColumns = s.length()/numRows;
		System.out.println("Linhas: " + numRows + " Colunas: " + numColumns);
		char[][] matriz = new char[numRows][numColumns];
		for(int i = 0; i < numRows; i++)
		{
			for(int j = 0; j < numColumns; j++)
			{
				System.out.print("i = " + i + " j = " + j + " cont = " + cont + " ");
				//System.out.print(s.charAt(cont) + " ");
				if(cont%2 != 0)
				{
					System.out.println(" ");
					//matriz[i][j] = s.charAt(cont);
					cont++;
				}
				else
				{
					matriz[i][j] = s.charAt(cont);
					cont += numRows;
				}
			}
			System.out.println();
			System.out.println("linha");
			cont = 1;
		}
		
		print(matriz);
    }

	static void print(char[][] matriz)
	{
		for(int i = 0; i < matriz.length; i++)
		{
			for(int j = 0; j < matriz[i].length; j++)
			{
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
