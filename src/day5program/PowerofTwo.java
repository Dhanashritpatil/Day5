package day5program;
import java.util.Scanner;
public class PowerofTwo {

	public static void main(String[] args) {
		int n;
		int p =2;
		 int Result=1;
		System.out.println("Enter the Number:");
		Scanner sc=new Scanner(System.in);
				n=sc.nextInt();
     
                for(int i=1; i<=p; i++)
                {
                	Result=n*Result;
                }
                System.out.println( "Power: " +Result);	
                }
                }


