package com.practicehashndqueue;

import java.util.HashMap;

public class Main {
 public static void main ( String[] args) {
	 HashMap <String , Integer> mobiles=new HashMap <>();

	 mobiles.put("Nokia" , 3060);
	 mobiles.put("Samsung", 2109);
	 mobiles.put("Oppo" , 6032 );
	 // for repetitions
	 mobiles.put( "Nokia" , 3060); // repetions not allowed in hash set
	 System.out.println("HashMap is:" +mobiles);
	 

 }
}





