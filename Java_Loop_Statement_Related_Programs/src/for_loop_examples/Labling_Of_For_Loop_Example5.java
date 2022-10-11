package for_loop_examples;

public class Labling_Of_For_Loop_Example5 {
	public static void main(String[] args) {
		outer_loop:
			for(int i=1;i<=3;i++) {
				inner_loop:
					for(int j=1;j<=3;j++) {
						if(i==2&&j==2) {
							break inner_loop;
						}
						System.out.println(i+" "+j);
					}
			}
	}
}
