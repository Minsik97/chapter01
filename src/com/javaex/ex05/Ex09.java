package com.javaex.ex05;

public class Ex09 {

	public static void main(String[] args) {
		
		int[] rayA = new int[] {10,20,30};
		int[] rayB = new int[] {11,20,20};
		
		
		if(rayA.length==rayB.length) {
			
			
			for(int i=0; i<rayA.length; i++) {
				if(rayA[i]!=rayB[i]) {
					System.out.println(i + "번째 값이 다릅니다.");
				}
			}
			
		}else {
			System.out.println("두배열 크기가 다릅니다.");
		}
		
		
		
		
		

	}

}
