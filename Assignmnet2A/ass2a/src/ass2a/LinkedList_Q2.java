package ass2a;
import java.util.*;

class student {
	String name;
	int age;
	int marks;
	student(String name,int age,int marks) {
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
}

public class LinkedList_Q2 {
	
	public static void print(LinkedList<student> l1) {
		for(int i=0;i<l1.size();i++) {
			System.out.println("Name: "+l1.get(i).name+" age: "+l1.get(i).age+" mark: "+l1.get(i).marks);
		}
	}
	public static void main(String[] args) {
		LinkedList<student> l1 = new LinkedList<>();
		l1.add(new student("Anurag",18,70));
		l1.add(new student("Vivek",19,80));
		l1.add(new student("Sushil",20,90));
		l1.add(new student("Sourav",21,100));
		print(l1);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name, age, mark to search : ");
		String n = sc.next();
		int a = sc.nextInt();
		int m= sc.nextInt();
		if(search(l1, new student(n,a,m))!= -1) {
			System.out.println("It is present");
		}
		else {
			System.out.println("It is not present");
		}
		System.out.print("Enter name, age, mark to remove : ");
		String n1 = sc.next();
		int a1 = sc.nextInt();
		int m1 = sc.nextInt();
		if(search(l1, new student(n1,a1,m1)) != -1) {
			remove(l1, search(l1, new student(n1,a1,m1)));
		}
		else {
			System.out.println("Invalid data");
		}
		print(l1);
	}

	public static int search(LinkedList<student> l1,student s1) {
		for(int i=0;i<l1.size();i++) {
			if(s1.name.equals(l1.get(i).name) && s1.age == l1.get(i).age && s1.marks == l1.get(i).marks) {
				return i;
			}
		}
		return -1;
	}
	public static void remove(LinkedList<student> l1,int i) {
		l1.remove(i);
	}
}
