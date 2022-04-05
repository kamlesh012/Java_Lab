import files.*;
import java.util.*;
public class Master{
	public static void user_func() {
		
		user obj = new user();
        obj.menuprint();
        int n;
        Scanner s1 = new Scanner(System.in);
        n=s1.nextInt();

        switch(n)
        {
            case 1:
             obj.search();
             break;

             case 2:
             obj.show();
             break;

            default:
            System.out.println("INVAlid input!!!!");
         }
	}
	
	public static void  manager_func() {
		
			manager obj = new manager();
	        obj.menuprint();
	        int n;
	        Scanner s1 = new Scanner(System.in);
	        n=s1.nextInt();

	        switch(n)
	        {
	            case 1:
	             obj.Rent();
	             break;

	             case 2:
	             obj.Return();
	             break;

	             case 3:
	             obj.List_all();
	             break;

	            default:
	            System.out.println("INVAlid input!!!!");
	        }
	}
	        
	public static void  admin_func() {
		 	admin obj = new admin();
	        obj.menuprint();
	        int n;
	        Scanner s1 = new Scanner(System.in);
	        n=s1.nextInt();

	        switch(n)
	        {
	            case 1:
	             obj.createTable();
	             break;

	             case 2:
	             obj.deletetable();
	             break;

	             case 3:
	             obj.LoadData();
	             break;

	             case 4:
	             obj.Show_records();
	             break;

	            //  case 5:
	            //  break;

	            default:
	            System.out.println("INVAlid input!!!!");

	        }
		}
	
	static void mainMenu() {
		
		System.out.println("Welcome to Car Rental System\n");
		System.out.println("Press : \n");
		System.out.println("1 for Administrator Access");
		System.out.println("2 for User Access");
		System.out.println("3 for Manager Access");
		System.out.println("4 to exit");
		int ch;
		Scanner inp=new Scanner(System.in);
		ch=inp.nextInt();
		switch(ch) {
		case 1:
			admin_func();
			break;
		case 2:
			user_func();
			break;
		case 3:
			manager_func();
			break;
		case 4:
			System.out.println("Exiting.");
			break;
		}
	}
	
	public static void main(String []args) {
		
       mainMenu();
       
       }
		
}
