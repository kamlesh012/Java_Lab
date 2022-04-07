//WAP to rearrange positive & negative numbers in an array
import java.util.*;
public class second{
	public static void main(String args[]){

	Scanner inp=new Scanner(System.in);

	int n;
	System.out.println("ENTER SIZE OF ARRAY");
	n=inp.nextInt();

	int a[]=new int[n];
	for(int i=0;i<n;i++){
	a[i]=inp.nextInt();
	}

	int pos=0,neg=0;
	while(pos<n && neg<n){
	while(pos<n && a[pos]<0 )pos++;
	while(neg<n && a[neg]>=0)neg++;
	if(pos<n && neg<n){
		int temp=a[pos];
		a[pos]=a[neg];
		a[neg]=temp;
	}

	}
	
	


	System.out.println("Final Array is");
	for(int i=0;i<n;i++){
	System.out.print(a[i]+" ");
	}


	
	}
}
