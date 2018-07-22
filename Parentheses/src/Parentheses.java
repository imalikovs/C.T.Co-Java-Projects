import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Parentheses {
	public boolean checkString(String s) {
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('{', '}');
		map.put('(', ')');
		map.put('[', ']');
		
	Stack<Character> stack = new Stack<Character>();
	char[] charArray = s.toCharArray();
		for (Character c: charArray) {
			if(map.keySet().contains(c)) {
				stack.push(c);}
			else
				if(map.values().contains(c)) {
				if(!stack.isEmpty() && map.get(stack.peek()) ==c) {
					stack.pop();
				}
				
				else
					return false;

		}}
		return stack.isEmpty();
	
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a string of parenthese(), brackets[], and braces{}. Then press enter to check if they are balanced.");
		String s = scanner.next();
		
		Parentheses check = new Parentheses();
		boolean balance = check.checkString(s);
		if (balance==true)
		System.out.println("balanced string");
		else
			System.out.println("unbalanced string");
	}
	
}
