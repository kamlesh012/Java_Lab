//Second
//Create a menu driven program Use switch cases to get maturity amount using term deposit & recurring deposit.
import java.util.*;

public class second{
	public static void main(String [] args){
	int p,r,t;
	double amount;

	Scanner inp=new Scanner(System.in);
	System.out.println("Enter P");
	p=inp.nextInt();
	System.out.println("Enter R");
	r=inp.nextInt();
	System.out.println("Enter Time in Years");
	t=inp.nextInt();
	System.out.println("Press 1 for TERM Deposit 2 for Recurring Deposit");
	int choice=inp.nextInt();
	switch(choice){
	case 1:
		amount=p*Math.pow(1+(r/100),t);
		System.out.println("Maturity Amount is "+amount);
		break;
	case 2: t*=12;
		amount=p*t+p*(t*(t+1)/2)*(r/100)*(1/12);
		System.out.println("Maturity Amount is "+amount);
		break;
}



	}

}
