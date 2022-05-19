//Program to delete Vowels from a String Usign String Buffer Class;
import java.util.Scanner;

public class Second {
	public static void main(String [] args) {
		String s;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String in LowerCase from which you want to delete vowels");
		s=scn.nextLine();
		StringBuffer str=new StringBuffer(s);

		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
			str.delete(i,i+1);
			i--;
			}
		}
		System.out.println(str);		
		
	}

}
