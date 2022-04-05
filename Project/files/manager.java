package files;
import java.util.*;
public class manager {
    
    public void menuprint()
    {
        System.out.println("Operations for Manager menu");
        System.out.println("1. manager a car copy \n2. Return a car \n3. List all-unreturned car copies which are checked within a period");
    }
    public void Rent(){

        int call_no,copy_no,user_id;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Call Number");
        call_no=inp.nextInt();

        System.out.println("Enter Copy Number");
        copy_no=inp.nextInt();

        System.out.println("User Id");
        user_id=inp.nextInt();
        //Check whether car is rented or not in database. if yes return null.

    }
    public void Return(){
        int call_no,copy_no,user_id;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Call Number:");
        call_no=inp.nextInt();

        System.out.println("Enter Copy Number:");
        copy_no=inp.nextInt();

        System.out.println("User Id:");
        user_id=inp.nextInt();
        //Check whether car is with given specifications if rented or not in database
        //if found in database then return it & update database


    }
    public void List_all(){
        //check all un-return
        String start,end;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Start Date:");
        start=inp.nextLine();
        System.out.println("Enter End Date:");
        end=inp.nextLine();
        //Now check in database all un-returned cars between start & end interval

    }

}
