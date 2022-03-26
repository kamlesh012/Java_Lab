// 4->Create two or three constructors and a normal method with same name. Call everything. Implement what was taught in last classes using the same.

public class Fourth{
  
Fourth(){
  System.out.println("Default Constructor is Called");
}
  
Fourth(int n)
{
  System.out.println("Parameterized COnstructor with value "+n+" is called");
}
  
void Fourth()
{
  System.out.println("This is a Normal Method  having same name as of a class. In Java as you can see it is allowed to have a normal method having same name as a class");
}
  
public static void main(String []args)
	{

	Fourth obj1=new Fourth();

	Fourth obj2=new Fourth(5);

	obj2.Fourth();
	
	}
}
