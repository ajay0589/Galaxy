package com.adp;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurance {

	public static void main(String[] args) {

		// Map , HashMap
		// Key, Value, Entry, EntrySet, KeySet, forEach
		// put,

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "java");
		map.put(2, "selenium");
		map.put(3, "testng");
		map.put(4, "cucumber");
		
	/*	System.out.println(map);
		
		System.out.println(map.get(3));
		
		map.remove(3);
		
		System.out.println(map);*/
		
		if(map.containsKey(3)) {
			map.remove(3);
		}
		
		
		/*map.clear();
		
		System.out.println(map);*/
		
		// --------------------------------------------------------------------------
		
		
		String s = "programmingr";
		
	    HashMap<Character,Integer> charCount = new HashMap();

	    for (char c : s.toCharArray()) {
	    	
	    	if(charCount.containsKey(c)) {
	    		charCount.put(c, charCount.get(c)+1);
	    	}
	    	else {
	    		charCount.put(c, 1);
	    	}
			
		}
		 
		System.out.println(charCount); 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
