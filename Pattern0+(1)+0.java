//Find 0..(1).0 pattern
import java.util.Scanner;

public class pattern {
	public static void main(String [] args) {
		int n,cnt=0;
		System.out.println("ENter Binary String conaining zeroes and ones");
		
		Scanner scn=new Scanner(System.in);
		String s=scn.nextLine();
		n=s.length();
		boolean ok=false;
		
		for(int i=0;i<n;i++) {
			if(s.charAt(i)=='0' && i+1<n && s.charAt(i+1)=='1' && ok==false)ok=true;
			else if(i-1>=0 && s.charAt(i-1)=='1' && s.charAt(i)=='0' && ok==true)cnt++;
		}
System.out.println(cnt);
		
	}

}
