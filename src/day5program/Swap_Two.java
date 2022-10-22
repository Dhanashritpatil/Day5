package day5program;
import java.util.Scanner;
public class Swap_Two {
         
     public static void main(String[] args) {
	         
	       int a; 
	       int b;
	       
			System.out.println("Enter the Number:");
			
		Scanner sc=new Scanner(System.in);
		 a =sc.nextInt();
		 b=sc.nextInt();
		 
	       a=a+b;
		   b=a-b;
		   a=a-b;
		   
			System.out.println("Swap of a&b:");
			System.out.println("a:"+a);
			System.out.println("b:"+b);

	}

}
