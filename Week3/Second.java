/*
1.Create a class stud(name roll age,) with parameterized constructor. Initiliase it by  taking value from user. then display.
Create a default constructor also.
Display info of at least 10 students.
Using array of objects.
2.Stud->Result(m1,m2,m3) Display name, rollno,age,percentage of marks.
*/
//Error_>Calling constructor before Printing Details.
//Improvement:-Derieved class is by default calling base class' default constructor.
//How can we call parameterized constructor of Base class using derievd class?
//DId not used constructor at all. Got the soultion.

import java.util.*;
class Stud{
String name;
int roll_no,age;
Scanner scn;
void setdetails(){
    		String name;
		int age;
		int roll;
		System.out.println("Enter Name age & Rollno of student no");
		scn=new Scanner(System.in);
		name=scn.nextLine();
    		this.name=name;
		age=scn.nextInt();
	    this.age=age;
		roll=scn.nextInt();
	    roll_no=roll;
}
void display(){
	System.out.println("name is"+name);
	System.out.println("Roll no is"+roll_no);
	System.out.println("Age is"+age);
}
}

class Result extends Stud{
int m1,m2,m3;
float percentage;
void setmarks(int marks1,int marks2,int marks3){
m1=marks1;
m2=marks2;
m3=marks3;
}

void disp(){
	System.out.println("Name is"+name);
	System.out.println("Roll no is"+roll_no);
	System.out.println("Age is"+age);
	System.out.println("Marks are "+m1+m2+m3);
	percentage=((m1+m2+m3)/300.0f)*100.0f;
	System.out.println("Percentage is "+percentage);
}

}

public class Second{
	public static void main(String [] a)
	{

	Result [] arr=new Result[10];
	Scanner scn;
	for(int i=0;i<10;i++)
	{
		scn=new Scanner(System.in);
		System.out.println("Enter Marks of three subjects");

		arr[i].setdetails();

		int m1,m2,m3;
		m1=scn.nextInt();
		m2=scn.nextInt();
		m3=scn.nextInt();

		arr[i]=new Result();
		
		arr[i].setmarks(m1,m2,m3);
		arr[i].disp();
	}
/*
	for(int i=0;i<10;i++){
		arr[i].disp();
	}
*/
	}
}

