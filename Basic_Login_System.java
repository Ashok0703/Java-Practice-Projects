package Basic_Login_System;
import java.util.*;
public class Basic_Login_System {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	HashMap <String ,String> storage=new HashMap<>();
	int c;
	do{
		System.out.println("Enter The Choice");
		System.out.println("1--> Login");
		System.out.println("2--> Change Password");
		System.out.println("3--> Register New Account");
		System.out.println("4--> Exit From The Page");
		c=sc.nextInt();
		sc.nextLine();
		switch(c) {
		case 1:
			System.out.println("Enter the user name");
			String u=sc.nextLine();
			System.out.println("Enter the password");
			String p=sc.nextLine();
			if(storage.containsKey(u) && storage.get(u).equals(p)) {
				System.out.println("Login SuccessFul \n --Welcome--");
			}
			else {
				System.out.println("Invalid Username Or Password");
			}
			break;
		case 2:
			System.out.println("Enter the username");
			String user=sc.nextLine();
			System.out.println("Enter the old password");
			String oldpass=sc.nextLine();
			System.out.println("Enter the new password");
			String newpass=sc.nextLine();
			if(storage.containsKey(user) && storage.get(user).equals(oldpass)) {
				storage.replace(user, newpass);
				System.out.println("Password Updated");
			}
			else {
				System.out.println("Invalid Username or Old Password");
			}
			break;
		case 3:
			System.out.println("Enter the Unique Username");
			String u1=sc.nextLine();
			System.out.println("Enter the Unique Password");
			String pass1=sc.nextLine();
			if(storage.containsKey(u1)) {
				System.out.println("User name Already Exist : TryAgain");
			}
			else {
			storage.put(u1, pass1);
			System.out.println("Registered SuccessFully");		
			}
			break;
		case 4:
			System.out.println("Exited SuccessFully");
		}
		System.out.println();
			
	}while(c!=4);
	

}
}
