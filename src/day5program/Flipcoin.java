package day5program;
import java.util.Scanner;
public class Flipcoin {

	public static void main(String[] args) {
		int Head = 0;
		int Tail = 0;
		int count =1;
		double randum = 0.0;
		
		System.out.println(" Enter The Number :");
		Scanner no = new Scanner(System.in);
		 
		int flips=no.nextInt();
		 
		while(count <= flips) {
			 randum = Math.random();
			System.out.println(count+" "+randum);
		if(randum<0.5) {	
		Head ++;
		System.out.println("Head");
		}
		else {
			
			Tail ++;
			System.out.println("Tail");
		}
		count ++;
		}
		System.out.println();
		System.out.println("Number of Head:" +Head);
		System.out.println(" Number of Tail:" +Tail);
		
		double Headpercent = (double) Head/flips*100;
		double Tailpercent = (double) Tail/flips*100;
		
		System.out.println("Percentage of Head:" +Headpercent);
		System.out.println("Percentage of Tail:"+Tailpercent);
		
		}
	}
	

