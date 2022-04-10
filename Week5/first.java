//First
////WAP to arrange an array in zig zag pattern
import java.util.*;
public class first{
	public static void main(String args[]){

	Scanner inp=new Scanner(System.in);

	int n;
	System.out.println("ENTER SIZE OF ARRAY");
	n=inp.nextInt();

	int a[]=new int[n];
	for(int i=0;i<n;i++){
	a[i]=inp.nextInt();
	}

	for(int i=0;i<n-1;i++){
		if( i%2==0 && a[i]>a[i+1] ){
	
		int temp=a[i];
		a[i]=a[i+1];
		a[i+1]=temp;

		}
		else if(i%2==1 && a[i]<a[i+1]){
		int temp=a[i];
		a[i]=a[i+1];
		a[i+1]=temp;
		}
	}

	System.out.println("ZigZag Array is");
	for(int i=0;i<n;i++){
	System.out.print(a[i]+" ");
	}


	
	}
}
