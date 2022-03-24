/*
1.Create a class stud(name roll age,) with parameterized constructor. Initiliase it by  taking value from user. then display.
Create a default constructor also.
Display info of at least 10 students.
Using array of objects.
*/
import java.util.*;
class Stud{
String name;
int roll_no,age;
Stud (){
    String name;
		int age;
		int roll;
		System.out.println("Enter Name age & Rollno of student no");
		Scanner scn=new Scanner(System.in);
		name=scn.nextLine();
    this.name=name;
		age=scn.nextInt();
    this.age=age;
		roll=scn.nextInt();
    roll_no=roll;
}
Stud(String name,int roll_no,int age){
	this.name=name;
	this.roll_no=roll_no;
	this.age=age;
	}
void display(){
	System.out.println("name is"+name);
	System.out.println("Roll no is"+roll_no);
	System.out.println("Age is"+age);
}
}

public class First{
	public static void main(String [] a)
	{

	Stud [] arr=new Stud[10];
	for(int i=0;i<10;i++)
	{
		String name;
		int age;
		int roll;
		System.out.println("Enter Name age & Rollno of student no"+(i+1));
		Scanner scn=new Scanner(System.in);
		name=scn.nextLine();
		age=scn.nextInt();
		roll=scn.nextInt();
		arr[0]=new Stud(name,roll,age);
		arr[0].display();
	}
	}
}
