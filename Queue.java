package com.practicehashndqueue;
import java.util.LinkedList;

public class Queue {
	public static void main(String[] args){
		Queue <Integer>  numbers  = new LinkedList <>();
		numbers.add (1);
		numbers.offer(2);
		numbers.offer(3);
		numbers.offer(4);
        numbers.offer(4);
      System.out.println(" Numbers =" +numbers); 
       
	
	// access element 
            int accessedNumber=numbers.peek();
            System.out.println(" Access element from the Queue:" +accessedNumber);
     
    // remove element 
            int removedNumber=numbers.poll();
            System.out.println(" Remove element :" +removedNumber);
            
            System.out.println(" Updated queue :" + numbers);
	}
}
