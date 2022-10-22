package day5program;
import java.util.Scanner;
public class QuentientAndRemainder {

	public static void main(String[] args) {
		int  divended;
		int divisor;
		
		System.out.println("Enter the Number:");
		Scanner sc=new Scanner(System.in);
        divended=sc.nextInt();
        divisor=sc.nextInt();
        int Quentient = divended/divisor;
        int Remainder= divended% divisor;
        
        System.out.println(" quen :" +Quentient);
        System.out.println("Remain :"+Remainder);
	}

}
