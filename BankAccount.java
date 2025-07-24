package Basicprograms.BankAccountOperatins;
import java.util.*;
class Bank_Account {
	private float balance;
	Bank_Account(float b){
		balance=b;
	}
	void deposit(float d){
		System.out.println("Amount deposited : "+d);
		balance+=d;
	}
	void withdraw(float w) {
		if(w<=balance && w>=0) {
			balance-=w;
		}
		else {
			System.out.println("Invalid Amount To Withdraw");
		}
	}
	void getBalance() {
		System.out.println("Current Balance : "+balance);
	}
	

}
class BankAccount{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Initial Deposit For New Account : ");
		float i_balance=sc.nextFloat();
		Bank_Account a1=new Bank_Account(i_balance);
		int choice;

        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1 --> Deposit");
            System.out.println("2 --> Withdraw");
            System.out.println("3 --> Check Balance");
            System.out.println("4 --> Exit");
            System.out.println();
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    float depositAmount = sc.nextFloat();
                    a1.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    float withdrawAmount = sc.nextFloat();
                    a1.withdraw(withdrawAmount);
                    break;

                case 3:
                    a1.getBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using our bank system!");
                    break;

                default:
                    System.out.println("Invalid option. Please choose 1 to 4.");
            }
        } while (choice != 4);

        sc.close();
    }
}
		

