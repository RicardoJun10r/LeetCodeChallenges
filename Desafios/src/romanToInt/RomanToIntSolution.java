import java.util.HashMap;
import java.util.Map;

public class RomanToIntSolution{
	
	public static void main(String[]args)
	{
		System.out.println(romanToInt("MCMXCIV"));
	}

	public static int romanToInt(String s)
	{
		Map<String, Integer> hashMap = new HashMap<>();

		configurarMap(hashMap);

		int soma = 0;
		int next = 0;
		for(int i = 0; i < s.length(); i++){
			if(i == s.length()-1){
				soma += hashMap.get(String.valueOf(s.charAt(i)));
				break;
			}
			next = ((next+1)%s.length());
			System.out.println(next);
			if(hashMap.get(String.valueOf(s.charAt(i))) >= hashMap.get(String.valueOf(s.charAt(next)))){
				System.out.println("soma: " + hashMap.get(String.valueOf(s.charAt(i))));
				soma += hashMap.get(String.valueOf(s.charAt(i)));
			} else {
				System.out.println("subtração: " + hashMap.get(String.valueOf(s.charAt(i))));
				soma -= hashMap.get(String.valueOf(s.charAt(i)));
			}
		}
		return soma;
	}

	public static void configurarMap(Map<String, Integer> hashMap){
		hashMap.put("I", 1);
		hashMap.put("V", 5);
		hashMap.put("X", 10);
		hashMap.put("L", 50);
		hashMap.put("C", 100);
		hashMap.put("D", 500);
		hashMap.put("M", 1000);
		hashMap.put(null, 0);
	}
}
