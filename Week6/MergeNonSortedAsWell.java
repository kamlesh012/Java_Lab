//import java.util.Scanner;
import java.util.*;
class ArrayDemo{
	ArrayDemo(){
		
	}
	ArrayDemo(int a[],int n,int b[],int m){
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		
		for(int i=0;i<m-1;i++) {
			for(int j=0;j<m-i-1;j++) {
				if(b[j]>b[j+1]) {
					int t=b[j];
					b[j]=b[j+1];
					b[j+1]=t;
				}
			}
		}
	}
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
				c[l]=a[i];
l++;
i++;
			}
			else {c[l]=b[j];l++;j++;}
		}
		
		while(i<p && l<size) {
			c[l]=a[i];
l++;
i++;
		}
		while(j<k && l<size) {
			c[l]=b[j];
l++;
j++;
		}
		for(int f=0;f<size;f++) {
			System.out.print(c[f]+" ");
		}
	}

}

public class first {
	public static void main(String [] args) {
		int n;
		System.out.println("Enter 1 for Searching 2 for Merging Sorted arrays 3 for Megrgin Non Sorted Arrays");
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
		else if(n==2){
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
			obj.arrayfunc(a, s1,b,s2);
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
			ArrayDemo obj2=new ArrayDemo(a,s1,b,s2);
			obj2.arrayfunc(a, s1, b, s2);
			
		}
		
	}

}
