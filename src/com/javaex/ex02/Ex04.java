package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		
		/*
		Scanner scn = new Scanner(System.in);
		
		System.out.println("이름을 입력해 주세요.");
		System.out.print("이름:");
		
		String name = scn.nextLine();
		
		System.out.println("당신의 이름은 " + name + " 입니다.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해 주세요.");
		System.out.print("나이:");
		
		int num = sc.nextInt();
		
		System.out.println("당신의 나이는 " + num + " 입니다.");
		
		
		scn. close();
		*/
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해 주세요.");
		System.out.print("나이:");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		
		System.out.println("이름을 입력해 주세요.");
		System.out.print("이름:");
		
		String name = sc.nextLine();
		
		System.out.println("당신의 이름은 " + name + " 나이는 " + num + " 입니다.");
		
		sc. close();

	}

}
