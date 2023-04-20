package ass2a;
import java.util.*;

public class arraylist_Q1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		a1.add(6);		
	    for (int value : a1) {  
	        System.out.println(value);  
	    } 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to search if its present: ");
		int search = sc.nextInt();
		if(a1.contains(search)) {
			System.out.println(search+ " is present");
		}
		else {
			System.out.println(search+ "is not present");
		}
		System.out.print("Enter the position of the element to remove: ");
		int position = sc.nextInt();
		a1.remove(position);
		System.out.println("After removing element from position : "+position);
	    for (int value : a1) {  
	        System.out.println(value);  
	    } 
	    if(a1.size()==0) {
	    	System.out.println("ArrayList is empty");
	    }
	    else {
	    	System.out.println("ArrayList is not empty");
	    }
	}

}
