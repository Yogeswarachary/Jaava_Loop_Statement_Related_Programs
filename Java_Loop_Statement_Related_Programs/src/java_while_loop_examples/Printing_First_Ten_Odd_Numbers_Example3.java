package java_while_loop_examples;

import java.util.Scanner;

public class Printing_First_Ten_Odd_Numbers_Example3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:- ");
		int num=sc.nextInt();
		//declaring variables
		//because of 'i'=1 can give you all odd numbers.
		int i=1;//if we change 'i' value as 2 we get all the even numbers
		
		//while loop from 1 to num(User entered number)
		while(i<=num) {
			System.out.println(i);
			//i=i+2;
			i++;
			//If we can give 'i++' insted of i=i+2, it will give you numbers only
		}
	}
}
