

import java.util.ArrayList;

public class Level2Class3HW {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Hi");
		list1.add("Bye");
		list1.add("Boo");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Who");
		list2.add("Hi");
		list2.add("Bye");
		
		ArrayList<String> listCommon = new ArrayList<String>(list2);
		listCommon.retainAll(list1);
		
		System.out.println(listCommon);

	}

}
