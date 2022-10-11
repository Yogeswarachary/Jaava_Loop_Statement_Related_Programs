package for_each_loop_examples;

import java.util.ArrayList;

public class For_Each_Loop_Collection_Traversing_Example3 {
	public static void main(String[] args) {
		//Creating a list of elements
		ArrayList<String> list=new ArrayList<String>();
		list.add("Yogesh");
		list.add("Rahul");
		list.add("Vishal");
		list.add("ShivaRam");
		//Traversing the list of elements using for each loop
		for(String name:list) {
			System.out.println(name);
		}
	}
}
