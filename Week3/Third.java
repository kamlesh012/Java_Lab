//3-> Using command line arguments take an integer,float,double.Use a wrapper class to convert reference type to value type.add all three values .then display.
public class Third{
	public static void main(String []args){

	int n1=Integer.parseInt(args[0]);
	double n2=Double.parseDouble(args[1]);
	float n3=Float.parseFloat(args[2]);

	System.out.println("Passed Numbers are "+n1+" "+n2+" "+n3);

	int sum=n1+(int)n2+(int)n3;

	System.out.println("The Sum of these three numbers is"+sum);

	}
}
