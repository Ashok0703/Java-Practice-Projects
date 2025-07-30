package Bobs_Chocolate;
import java.util.Scanner;
public class Bobs_Chocolate {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Total Amount");
		int amount=sc.nextInt();
		System.out.println("Enter the Price per one Chocolate");
		int cost=sc.nextInt();
		System.out.println("Enter the number of wrappers to exchange one free chocolate");
		int wrapper=sc.nextInt();
		System.out.println("The Total Number of Chocolates is "+totalchocolate(amount,cost,wrapper));
	}
	static int totalchocolate(int a,int c,int w) {
		int t=a/c;
		int wraprest=t;
		while(wraprest>=w) {
			int extra=wraprest/w;
			t+=extra;
			wraprest=wraprest%w+extra;
			
		}
		return t;
	}
}
