package Basics;

import java.util.Scanner;

//Define the base class Person
class Person1 {
 String name;
 int age;

 // Constructor for Person class
 public Person1(String name, int age) {
     this.name = name;
     this.age = age;
 }
}

//Define the subclass Employee inheriting from Person
class Employee extends Person1 {
 String employeeID;
 double salary;

 // Constructor for Employee class
 public Employee(String name, int age, String employeeID, double salary) {
     super(name, age); // Call the superclass constructor to initialize name and age
     this.employeeID = employeeID;
     this.salary = salary;
 }
}

public class Main {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Input from user
     System.out.print("Enter name: ");
     String name = scanner.nextLine();
     System.out.print("Enter age: ");
     int age = scanner.nextInt();
     scanner.nextLine(); // Consume newline
     System.out.print("Enter employee ID: ");
     String employeeID = scanner.nextLine();
     System.out.print("Enter salary: ");
     double salary = scanner.nextDouble();

     // Create an Employee object with user input values
     Employee employee1 = new Employee(name, age, employeeID, salary);

     // Displaying employee details
     System.out.println("\nEmployee Details:");
     System.out.println("Name: " + employee1.name);
     System.out.println("Age: " + employee1.age);
     System.out.println("Employee ID: " + employee1.employeeID);
     System.out.println("Salary: " + employee1.salary);

     scanner.close();
 }
}

/*Enter name: Preethi
Enter age: 20
Enter employee ID: 62
Enter salary: 70000

Employee Details:
Name: Preethi
Age: 20
Employee ID: 62
Salary: 70000.0
*/