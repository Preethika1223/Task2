package Basics;
import java.util.*;
public class Person {
	final static int age=18;//using final keyword we can't able to change age
	private String name;
	Person(String name,int age){
		this.name=name;
	}
	//method to display name and age
	public void display(String name,int age) {
		System.out.println(this.name+" "+age);
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		Person p=new Person(name, age);
		p.display(name,age);   
		sc.close();
	}

}
/*output
 Preethi
 Preethi 18
 */
