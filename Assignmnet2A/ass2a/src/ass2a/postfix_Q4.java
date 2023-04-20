package ass2a;
import java.util.*;

public class postfix_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "231*+9-";
		postfix(str);
	}
	static void postfix(String str) {
		Stack<Integer> stack = new Stack<Integer>();
		 for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (Character.isDigit(ch)) {
	            	stack.push(ch - '0');
	            }
	            else {
	                int x = stack.pop();
	                int y = stack.pop();	 
	                switch (ch) {
	                case '+':
	                    stack.push(x + y);
	                    break;
	                case '-':
	                    stack.push(y - x);
	                    break;
	                case '/':
	                    stack.push(y / x);
	                    break;
	                case '*':
	                    stack.push(y * x);
	                    break;
	                case '%':
	                    stack.push(y % x);
	                    break;
	                }
	            }
		 }
		 System.out.println(stack.pop());
	}

}
