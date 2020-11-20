package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		int[] lottoNum = new int[6];
		
		lottoNum[0] = (int)(Math.random()*45)+1;
		lottoNum[1] = (int)(Math.random()*45)+1;
		lottoNum[2] = (int)(Math.random()*45)+1;
		lottoNum[3] = (int)(Math.random()*45)+1;
		lottoNum[4] = (int)(Math.random()*45)+1;
		lottoNum[5] = (int)(Math.random()*45)+1;
		
		/*같은 표현
		 for(int i=0; i<=lottoNum.length;i++){
		 lottoNum[i] = (int)(Math.random()*45)+1;
		}*/
		
		
		for(int i=0;i<lottoNum.length;i++) {
			System.out.println(lottoNum[i]);
		}
		
		
			
		} 

}
