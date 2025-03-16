package Programs;

import java.util.Scanner;
import java.util.Stack;

public class balancedParenthesesChecker {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string");
		String s = sc.nextLine();
		System.out.println(isbalanced(s));
	}
		static String isbalanced(String s) {
		Stack<Character> stk = new Stack<>();
		for (int i=0; i<s.length(); i++) {
	          
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')  {
                stk.push(s.charAt(i)); 
            }
            else if (!stk.empty() && 
                    ((stk.peek() == '(' && s.charAt(i) == ')') ||
                     (stk.peek() == '{' && s.charAt(i) == '}') ||
                     (stk.peek() == '[' && s.charAt(i) == ']')))
                {
                    stk.pop(); 
                }
               else if(Character.isDigit(s.charAt(i))) {
                	continue;
                }
            
           	 
               else if((!Character.isLetterOrDigit(s.charAt(i)))&&( s.charAt(i) != '(')&& (s.charAt(i) != '{')&&( s.charAt(i) != '[')&&( s.charAt(i) != ')')&& (s.charAt(i) != '}')&&( s.charAt(i) != ']')) 
               {
            	  continue;
              
               }
              else {
           	   return "Not balanced";
             }
		}
		return "balanced";
}
}