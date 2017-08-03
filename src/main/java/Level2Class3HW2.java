

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Level2Class3HW2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Two");
		list.add("One");
		
		Collections.sort(list);
		
		Iterator<String> dupsList = list.iterator();
		
		String prev = "";
		boolean foundDuplicate = false;
		while(dupsList.hasNext())
		{
			String current = dupsList.next();
			if(current.equals(prev))
				foundDuplicate = true;
			else
				foundDuplicate = false;
			
			if(foundDuplicate)
			{
				System.out.println(current);
			}
			prev = current;
		}
		
		
			

	}

}
