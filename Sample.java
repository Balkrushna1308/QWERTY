class Sample
{
	public static void main(String[] args) {
		
	}
}
import java.util.*;
class Department
{
	String name;
	int student;
	double per;
	Scanner sc=new Scanner(System.in);
	Department()
	{
		System.out.println("Enter For First Department");
		System.out.println("Enter Name of HOD");
		name=sc.nextLine();
		System.out.println("Enter Total Students");
		student=sc.nextInt();
		System.out.println("Enter the Average Result");
		per=sc.nextDouble();
	}
	Department(String name)
	{
		System.out.println("Enter For Second Department");
		this.name=name;
		System.out.println("Enter Total Students");
		student=sc.nextInt();
		System.out.println("Enter the Average Result");
		per=sc.nextDouble();
	}
	void display()
	{

		System.out.println("Name of HOD: "+name);
		System.out.println("Total Students: "+student);
		System.out.println("Average Result: "+per);
	}
}