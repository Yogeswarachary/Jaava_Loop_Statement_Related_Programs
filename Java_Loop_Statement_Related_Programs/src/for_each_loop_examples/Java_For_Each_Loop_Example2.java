package for_each_loop_examples;

public class Java_For_Each_Loop_Example2 {
	public static void main(String[] args) {
		//array or collection data need for 'for each loop'
		int arr[]= {1,2,3,4,5};
		int total=0;
		for(int var:arr) {
			total=total+var;
		}
		System.out.println("Total "+total);
	}
}
