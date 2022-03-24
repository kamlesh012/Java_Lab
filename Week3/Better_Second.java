/*
1.Create a class stud(name roll age,) with parameterized constructor. Initiliase it by  taking value from user. then display.
Create a default constructor also.
Display info of at least 10 students.
Using array of objects.
2.Stud->Result(m1,m2,m3) Display name, rollno,age,percentage of marks.
*/
//Improvement:-Derieved class is by default calling base class' default constructor.
//How can we call parameterized constructor of Base class using derievd class? Using SUper keyword.Don't know how to use that though.
//

import java.util.*;
class Stud{
String name;
int roll_no,age;
Scanner scn;
Stud(){
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
Result(){
	System.out.println("Enter Marks of three subjects");
		int m1,m2,m3;
		m1=scn.nextInt();
		m2=scn.nextInt();
		m3=scn.nextInt();
	this.m1=m1;
	this.m2=m2;
	this.m3=m3;
}

Result(int marks1,int marks2,int marks3){
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

public class Better_Second{
	public static void main(String [] a)
	{

	Result [] arr=new Result[10];
	Scanner scn;
//Operation using two types:-
	scn=new Scanner(System.in);
	for(int i=0;i<10;i++)
	{
				

//Way 1:-Calling parameterized constructor of derieved class;
//:-Using this way it is first calling prameterized constructor of derieved calss then default constructor of base class.

		System.out.println("Enter Marks of three subjects");
		int m1,m2,m3;
		m1=scn.nextInt();
		m2=scn.nextInt();
		m3=scn.nextInt();

		arr[i]=new Result(m1,m2,m3);


//Way2:- Calling default constructor of derived calss which will call default constructor of base class first.
//		arr[i]=new Result();
		
		arr[i].disp();
	}
	}
}
