package com.practicehashndqueue;

import java.util.HashMap;
import java.util.Map.Entry;

public class Main {
 public static void main ( String[] args) {
	 HashMap <Integer , String> mobiles=new HashMap <>();

	 mobiles.put( 1 ,"Nokia" );
	 mobiles.put(2 ,"Samsung");
	 mobiles.put(3,"Oppo" );
	 // for repetitions
	 mobiles.put(3, "oppo" ); // repetitions not allowed in hash set
	 System.out.println("HashMap is:" +mobiles);
	  
	 //for accessing elements of hash map 
      String value = mobiles.get(1);
      String value1 = mobiles.get(2);
      String value2 = mobiles.get(4);
      System.out.println("value at given index:" +value);
      System.out.println("value at given index:" +value1);
    System.out.println("value at given index:" +value2);// pointing to null bcoz no any value at index 4 

    System.out.println(" keys in the hashset:" +mobiles.keySet());// shows all keys
    System.out.println(" Values in the hashset:" +mobiles.values());// shows all values
    System.out.println(" keys and values in the hashset:" +mobiles.entrySet());
    
    
    //before replace
    System.out.println("Before replace element in the hashset :"+mobiles );
    mobiles.replace(2,"iphone"); // replace the value in the hashmap using key
    System.out.println(" After replace Elements in the hash map" +mobiles);
    // before removing
    System.out.println(" Before remove Hashset have  :" +mobiles);
    String value3=mobiles.remove(2) ;  //removing element fromm the hashset
    System.out.println(" After remove  updated hashset"+ mobiles);
    
    //iterate through keys
    System.out.println("Keys: ");
    for (Integer key: mobiles.keySet()) {
    	System.out.println(key);
    	System.out.println(", ");
    }
    // iterate through value 
    	System.out.println("  \n values: ");
    	for (String  Value : mobiles.values ()) {
    		System.out.println(Value);
    		System.out.println(", ");
    	}
    	// iterate through Entryset
    	System.out.println("  \n Keyvalues: ");
    	for (Entry <Integer , String> entry: mobiles.entrySet ()) {
    		System.out.println(entry);
    		System.out.println(", ");
    	}
    }
 }
 






