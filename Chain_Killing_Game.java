package Bobs_Chocolate;
import java.util.Scanner;
class Chain_Killing_Game {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of players");
		int n=sc.nextInt();
		System.out.println("Enter the position to eleminate the player");
		int p=sc.nextInt();
		System.out.println("The winner is at the position "+(winner(n,p)+1));
	}
	static int winner(int n,int k) {
		if(n==1) {
			return 0;
		}
		else {
			return ((winner(n-1,k)+k)%n);
		}
	}

}
