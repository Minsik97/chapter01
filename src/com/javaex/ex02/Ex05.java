package com.javaex.ex02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해 주세요.");
		System.out.print("나이:");
		int age = sc.nextInt();
		
		sc.nextLine();		
		
		System.out.println("이름을 입력해 주세요.");
		System.out.print("이름:");
		
		String name = sc.nextLine();
							
		
		System.out.println("키를 입력해 주세요.");
		System.out.print("키:");
		double key = sc.nextDouble(); 
		
		System.out.println("당신의 이름은 " + name + " 나이는 " + age + " 키는 " + key + " 입니다.");
		
		
		System.out.println("깃허브 테스트 문장");
		System.out.println("깃허브 테스트 문장");
		
		sc.close();

	}

}
