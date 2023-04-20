package ass2a;
import java.util.*;

public class Dec_Bin_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a decimal value: ");
		int decimal = sc.nextInt();
		int p=0;
		while(decimal!=0) {
			p=decimal%2;
			stack.push(p);
			decimal=decimal/2;
		}
		for (int i = stack.size() - 1; i >= 0; i--) {
	          System.out.print(stack.get(i));
	        }
	        System.out.println();
	}
}