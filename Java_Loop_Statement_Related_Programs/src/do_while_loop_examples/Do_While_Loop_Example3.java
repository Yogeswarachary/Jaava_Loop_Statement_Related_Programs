package do_while_loop_examples;

public class Do_While_Loop_Example3 {
	public static void main(String[] args) {
		//Declaring and initializing integer values
		int x=21, sum=0;
		
		//do-while loop
		do {
			//body of loop. It was printed even the condition is false
			sum+= x;
			x--;
		}
		//Now checking condition
		while(x>10);
		//summing up
		System.out.println("Summation: "+sum);
	}
}
