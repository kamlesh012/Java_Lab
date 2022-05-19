//Find number of 0+(1..1)+0 patterns in a string.
import java.util.Scanner;

public class Third {

public static void main(String []args){
	String s;
	System.out.println("Enter a String ");

	Scanner scn=new Scanner(System.in);
	s=scn.nextLine();
	

	int ind=-1,cnt=0;

	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='0' && ind==-1)ind=1;
		else if(s.charAt(i)=='0' && ind!=-1 && s.charAt(i-1)=='1') {
		cnt++;ind=i;
		}
	}
	System.out.println(cnt);	
}


}
