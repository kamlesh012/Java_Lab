//Convert all 0's to 1's in a number without converting to a string.
import java.util.*;

public class fourth{
	public static void main(String [] args){
	System.out.println("ENTER Your NUMBER");
	Scanner inp=new Scanner(System.in);
	int n=inp.nextInt();
		
    //Logic! :my logic to reverse it & then reverse it back
		//Optional
/*	int ans=0;
	int m=n;	
	while(n>0)
	{
	
	if(n%10==0){
	ans=ans*10+1;
	}
	else ans=ans*10+n%10;
		n/=10;
	ok=true;
	}
	while(ans>0)
	{
	reversed=(reversed*10)+(ans%10);
	ans/=10;
	}
	System.out.println(reversed);
*/

/*Logic 2*/
	int m=n;
	int number=0,i=0;
	while(m>0){

	if(m%10==0){
		number=(int)(number+(Math.pow(10,i)*1));
	}

	else 
		number=(int)(number+(Math.pow(10,i)*(m%10)));
	m/=10;
	//System.out.println(Math.pow(10,i));
	i++;

	}
	System.out.println(number);
	




	}

}
