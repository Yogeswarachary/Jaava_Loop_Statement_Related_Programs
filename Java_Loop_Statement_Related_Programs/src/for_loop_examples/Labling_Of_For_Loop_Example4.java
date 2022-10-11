package for_loop_examples;

public class Labling_Of_For_Loop_Example4 {
	public static void main(String[] args) {
		//Using label for outer and inner for loop
		outer_for_loop:
			for(int i=1;i<=3;i++) {
				inside_for_loop:
					for(int j=1;j<=3;j++) {
						if(i==2&&j==2) {
							break outer_for_loop;
						}
						System.out.println(i+" "+j);
					}
			}
	}
}
