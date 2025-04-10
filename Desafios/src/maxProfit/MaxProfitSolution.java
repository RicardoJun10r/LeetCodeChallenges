package maxProfit;

public class MaxProfitSolution{
	
	public static int maxProfit(int[] prices) {
        int menor, menorPosicao, maior;

		menor = menorNumero(prices);
		menorPosicao = posicaoNumero(menor, prices);
		//if(menorPosicao == 0) return 0;
		maior = maiorNumero(menorPosicao, prices);

		return maior - menor;

    }

	public static int maiorNumero(int posicao, int[]vetor){
		int maior = 0;
		for(int i = posicao; i < vetor.length; i++){
			if(maior < vetor[i])
				maior = vetor[i];
		}

		return maior;	
	}

	public static int menorNumero(int[]vetor){
		int menor = 100;
		for(int i = 0; i < vetor.length; i++){
			if(menor > vetor[i])
				menor = vetor[i];
		}
		return menor;
	}

	public static int posicaoNumero(int numero, int[]vetor){
		int posicao = 0;
		for(int i = 0; i < vetor.length; i++){
			if(vetor[i] == numero)
				posicao = i;
		}
		if(posicao != vetor.length-1)
			return posicao;
		else
			return 0;
	} 
}
