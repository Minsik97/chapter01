package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {
		int[]	intArray = new int[5];
		
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
		intArray[3] = 12;
		intArray[4] = 55;

		
		//for문으로 한번에 뽑아낼 수 있음
		for(int i=0; i<=4; i++) {
			System.out.println(intArray[i]);
			
		}
		
		
		
	}

}
