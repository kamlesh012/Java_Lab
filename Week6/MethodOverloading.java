/*Write a program to demonstrate method overloading using a class array demo
with two functions
funciton one- array(int [],int k);//find all numbers having sum equal to k
function two -array(int a[],int p,int b[],int k);//merge a & b of size p & k
*/
import java.util.*;
class ArrayDemo{
	void arrayfunc(int a[],int key) {
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]+a[j]==key) {
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
	}
	void arrayfunc(int a[],int p,int b[],int k) {
		int size=p+k;
		int c[]=new int[size];
		int i=0,j=0,l=0;
		while(i<p && j<k && l<size) {
			if(a[i]<b[j]) {
				c[l++]=a[i++];
			}
			else {c[l++]=b[j++];}
		}
		
		while(i<p && l<size) {
			c[l++]=a[i+++];}
    
		while(j<k && l<size) {
			c[l++]=b[j++];
		}
		for(int f=0;f<size;f++) {
			System.out.print(c[f]+" ");
		}
	}

}

public class first {
	public static void main(String [] args) {
		int n;
		System.out.println("Enter 1 for Searching 2 for Merging");
		Scanner in=new Scanner(System.in);
		n = in.nextInt();
		ArrayDemo obj=new ArrayDemo();
		
		if(n==1) {
			System.out.println("ENTER SIZE OF ARRAY & elements");
			n=in.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=in.nextInt();
			}
			System.out.print("Enter Target Element");
			int target=in.nextInt();
			obj.arrayfunc(a, target);

		}
		else {
			int s1,s2;
			System.out.println("ENTER SIZE OF first ARRAY & elements");
			s1=in.nextInt();
			int a[]=new int[s1];
			for(int i=0;i<s1;i++) {
				a[i]=in.nextInt();
			}
			System.out.println("ENTER SIZE OF Second ARRAY & elements");
			s2=in.nextInt();
			int b[]=new int[s2];
			for(int i=0;i<s2;i++) {
				b[i]=in.nextInt();
			}
for(int i=0;i<s1;i++)System.out.print(a[i]);
for(int i=0;i<s2;i++)System.out.print(b[i]);
System.out.println();
			obj.arrayfunc(a, s1,b,s2);
			
		}
		
	}

}
