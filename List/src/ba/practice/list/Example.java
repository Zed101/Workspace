package ba.practice.list;

import java.util.ArrayList;

public class Example {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		list2.add(23);
		list2.add(43);
		
		list.add(2);
		list.add(34);
		
		System.out.println(list);
		
		list.remove(1);
		list.addAll(list2);
		
		System.out.println(list);
		
	}

}
