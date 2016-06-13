
/*
 * Author: Jimmy Paul
 * 
 * Version: 1.0 
 * 
 * Date: 17-May-2016
 * 
 * Description: 
 * This program accepts two numbers as input and finds 
 * perfect squares in the sequence between those numbers. 
 * Cases not covered in this version are: 
 * - checking if first input is lesser than second input
 * - negative numbers as input 
 * 
 */ 

import java.util.Scanner; 
import java.util.*;

class FindSquares {
	
	public static void main(String[] args) {
		
		System.out.print("Enter first number of sequence: ");
		Scanner scanInStart = new Scanner(System.in);
		int inputIntStart = scanInStart.nextInt(); // Get first number (int)
		
		System.out.print("Enter last number of sequence: ");
		Scanner scanInEnd = new Scanner(System.in);
		int inputIntEnd = scanInEnd.nextInt(); // Get last number (int)
		
		// Declaring an array to hold all numbers in between the two numbers (inclusive) 
		// Size of array is equal to total numbers; hack: add 1 to array size to traverse last number 
		int tempRange = (inputIntEnd - inputIntStart) + 1; // size of input sequence + 1 
		int[] nosRange = new int[tempRange]; // array to hold entire sequence of numbers 
		int tempNos = inputIntStart; // Go figure :)
		
		for(int i = 0; i < tempRange; i++) {
			nosRange[i] = tempNos; // populate array with input sequence 
			tempNos++;
		}
		
		TreeMap<Integer, Integer> valueSquare = new TreeMap<Integer, Integer>();
		
		for(int i = 1; i <= inputIntEnd; i++) {
			valueSquare.put(i, (i*i)); // populate the TreeMap with number-square pairs 
		}
		
		Iterator inter = valueSquare.entrySet().iterator(); // iterator for TreeMap 
		int[] matchingElements = new int[tempRange]; 
		int matchCounter = 0; 
		
		while(inter.hasNext()) {
			Map.Entry me = (Map.Entry)iter.next(); 
			
			for(int i = 0; i < tempRange; i++) {
				if(me.getValue() == nosRange[i]) {
					Integer keyNum = (Integer)me.getKey();
					int tempKeyNum = keyNum;
					matchingElements[matchCounter] = keyNum;
					matchCounter = matchCounter + 1;
				}
			}
		}
		
		// matchingElements array has all the numbers which have its perfect
		// squares in the input sequence
		
		//<Perform operation with the matchingElements array>
	
	}
}