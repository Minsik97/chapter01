package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		int pay;//급여 -->위에 선언한 이유 고민해 볼 것.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		
		
		int point = sc.nextInt();
		
		if (point>8) {
			pay = 8*10000+(point-8)*15000;
		}else {
			pay = point*10000;
		}
		
		System.out.println("임금은 " + pay + "원 입니다.");
		
		
		
		
		sc.close();
		
	}

}
