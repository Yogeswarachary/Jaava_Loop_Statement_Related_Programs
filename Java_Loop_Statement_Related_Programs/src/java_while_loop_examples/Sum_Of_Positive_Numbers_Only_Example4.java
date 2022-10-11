package java_while_loop_examples;

import java.util.Scanner;

public class Sum_Of_Positive_Numbers_Only_Example4 {
	public static void main(String[] args) {
		int sum=0;
		
		//Create an object of scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:- ");
		int number=sc.nextInt();
		
		//while loop continues, until entered number is positive
		while(number>=0) {
			//add only positive numbers
			sum+=number;
			
			System.out.println("enter a number");
			number=sc.nextInt();
		}
		System.out.println("Sum= "+sum);
		sc.close();
	}
}
