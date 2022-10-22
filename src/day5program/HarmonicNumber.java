package day5program;
import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
	int num; double Result= 0.0;
	System.out.println( " Enter the Number ");
      Scanner n =new Scanner(System.in);
       num =n.nextInt();
      for(int i=num; i>0; i-- );
      Result=Result +( double)1/num; //logic
      System.out.println(Result + ", ");
	}

}
