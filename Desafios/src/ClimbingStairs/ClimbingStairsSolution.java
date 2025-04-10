package ClimbingStairs;
public class ClimbingStairsSolution
{

	public static int climbStairs(int n){

		int resultado = 0, proximo = 1, anterior = 1;
		if(n > 1)
		{
			for(int i = 0; i < n; i++){
				resultado = anterior + proximo;
				anterior = proximo;
				proximo = resultado;
			}
		} else {

			return 1;
		
		}
		return resultado;
	}
}
