package java_while_loop_examples;

public class Addtion_Of_First_Ten_Numbers_Example2 {
	public static void main(String[] args) {
		int x=1, sum=0;
		
		//Exit when x becomes greater than 4
		while(x<=10) {
			//summing up x
			sum=sum+x;
			//Incrementing the value of x for next iteration
			x++;
		}
		System.out.println("Summation:"+sum);
	}
}
