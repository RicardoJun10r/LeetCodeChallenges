import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista = fizzBuzz(3);
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i).toString());
        }
    }

    public static List<String> fizzBuzz(int n) {
        List<String> resposta = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(((i%3) == 0) && ((i%5) == 0)){
                resposta.add("FizzBuzz");
            }
            else if((i%3) == 0){
                resposta.add("Fizz");
            }
            else if((i%5) == 0){
                resposta.add("Buzz");
            }
            else {
                resposta.add(String.valueOf(i));
            }
        }
        return resposta;
    }
}