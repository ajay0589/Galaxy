package com.adp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionTopic {

	public static void main(String[] args) {
	
		
		// List, Set, Map
		
		// List > ArrayList, LinkedList
		// Set  > HashSet,  LinkedHashSet
		// Map > HashMap, LinkedHashMap
		
		// Collections
		List list = new ArrayList();
		Set set = new HashSet();
		set.add(1);
		set.add(1);
		
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add("ajay");
		list.add('v');
		
		System.out.println(list);  
		
		list.remove(2);
		
		System.out.println(list);  
		
		
		System.out.println(list.get(1));  
		
		for (Object object : list) {
			System.out.println("Value is: "+object);
		}
		
		
		
		List<String> list1 = new ArrayList();
		
		list1.add("java");
		list1.add("selenium");
		list1.add("testng");
		list1.add("10");
		
		System.out.println(list1);
		
		
		
		
		
		
		

	}

}
