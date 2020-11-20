package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {
		
		/*방법1
		int[] intArray = new int[3];
		
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
		*/
		//intArray.lenght -->3
		
		
		//방법2
		int[] intArray = new int[]{3,6,9};
		
		
		/*방법3
		int[] intArray = {3,6,9};
		*/
		for(int i=0; i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
		
		
		
		
		

	}

}
