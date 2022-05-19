//Create a class Bank that can generate unique account number + deposit withdraw & display information.
import java.util.Scanner;

class Bank {
	static int num=1000;
	String name;
	String address;
	int acnum;
	int bal=0;
	Bank(String name,String address,int bal){
		this.name=name;
		this.address=address;
		this.bal=bal;
	}
	void generate_acnum() {
		acnum=num++;
		System.out.println("Unique Account Number is"+acnum);
	}
	void display() {
		System.out.println("Name:-"+name);
	System.out.println(" Adddress:"+address);
	System.out.println(" Account Number:"+acnum);
	System.out.println("CUrrent Balance: "+bal);
	}
	void transaction() {
		System.out.println("ENTER 1 for deposit 2 for Withdraw");
		int ch;
		Scanner scn=new Scanner(System.in);
		ch=scn.nextInt();
		if(ch==1) {
			System.out.println("ENTER AMOUTN TO DEPOSIT");
			ch=scn.nextInt();
			bal+=ch;
		}
		else {
			System.out.println("ENTER AMOUTN Withdraw");
			ch=scn.nextInt();
			bal-=ch;
		}
	}
}
public class First{
	public static void main(String []k) {
Scanner scn=new Scanner(System.in);

	System.out.println("ENTER NAME");
	String name=scn.nextLine();
	System.out.println("ENTER Address");
	String address=scn.nextLine();
	System.out.println("ENTER Balance");
	int bal=scn.nextInt();
		Bank obj=new Bank(name,address,bal);
		obj.generate_acnum();
		obj.display();
		obj.transaction();		
		System.out.println("After Transaction");
		obj.display();
		
	}
}
