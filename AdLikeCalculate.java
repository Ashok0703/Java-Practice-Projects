 /*
         * Problem Logic:
         * - Each day, 5 new people receive the ad (fresh daily reach)
         * - Plus, we add people shared from previous day's likes (dailyShared)
         * - Half of the total who see the ad like it: (5 + dailyShared) / 2
         * - Each person who likes it shares with 3 more people
         * - These new shares become part of the next day's total receivers
         * - We repeat this process for 'd' days and sum up all likes
         */
package Basic_Realtme_applications;
import java.util.Scanner;
public class AdLikeCalculate {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of days till for calculate likes");
		int d=sc.nextInt();
		int total_likes=0;
		int likes=0;
		int dailyshared=0;
		//daily 5 adb is shared 
		//the liked persond share the ad to 3 persons
		int n=0;
		while(d>0) {
			likes=(5+dailyshared)/2;
			total_likes+=likes;
			dailyshared=likes*3;
			d--;
			n++;
			System.out.println("Day "+n+" like is "+likes);
			
			
		}
		System.out.println("Total likes for "+d+" is "+total_likes);
		
	}
}
