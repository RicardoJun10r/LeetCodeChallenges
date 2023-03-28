import java.util.Stack;

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

		// if(s.length()%2 != 0) return false;

		Stack<Character> pilha = new Stack<>();

		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
				pilha.push(s.charAt(i));
			}
			if(s.charAt(i) == ')'){
				if(pilha.peek() == '('){
					pilha.pop();
				}
			}
			if(s.charAt(i) == ']'){
				if(pilha.peek() == '['){
					pilha.pop();
				}
			}
			if(s.charAt(i) == '}'){
				if(pilha.peek() == '{'){
					pilha.pop();
				}
			}
		}

		// for(int i = 0; i < s.length(); i++){
		// 	if(s.charAt(i) == ')'){
		// 		if(pilha.peek() == '('){
		// 			pilha.pop();
		// 		}
		// 	}
		// 	if(s.charAt(i) == ']'){
		// 		if(pilha.peek() == '['){
		// 			pilha.pop();
		// 		}
		// 	}
		// 	if(s.charAt(i) == '}'){
		// 		if(pilha.peek() == '{'){
		// 			pilha.pop();
		// 		}
		// 	}
		// }

		if(pilha.size() == 0) return true;
		else return false;
	}
}
