package day5program;
import java.util.Scanner;
public class Three_Largest_Number {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
        c=sc.nextInt();
       if(a>b)
       {if(a>c)
       {
    	   System.out.println("a is largest:");
       }
       else
       {
    	   System.out.println("c is largest");
       }
       }
       else if(b>c)
       { 
    	   System.out.println("b is largest");
	}
       else
       { 
    	   System.out.println("c is largest");
        }
      }
	}