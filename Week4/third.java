//Third
//Check if two numbers are friendly pair or not
import java.util.*;

public class third{
	public static void main(String [] args){
	System.out.println("ENTER TWO NUMBERS");
	Scanner inp=new Scanner(System.in);
	int n=inp.nextInt();
	int m=inp.nextInt();
	double s1=0,s2=0;
	for(int i=1;i<n;i++){
	if(n%i==0)s1+=i;
	}	
s1/=n;
for(int i=1;i<m;i++){
	if(m%i==0)s2+=i;
	}	
s2/=m;
	System.out.println(s1==s2);




	}

}
