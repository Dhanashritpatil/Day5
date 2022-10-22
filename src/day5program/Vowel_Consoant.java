package day5program;

import java.util.Scanner;

public class Vowel_Consoant {
	public static void main(String[] args) {
		String ch;
		System.out.println("Enter the alphabate:");
		Scanner sc=new Scanner(System.in);
		ch=sc.next();
		
		switch(ch) 
		{
		case"a":
			System.out.println("vowel");
			break;
		case"e":
			System.out.println("vowel");
			break;
		case"i":
			System.out.println("vowel");
			break;
		case"o":
			System.out.println("vowel:");
			break;
		case"u":
			System.out.println("vowel");
		     break;
		default:
			System.out.println("consoant");
			break;
		}
	}
}
