package com.javaex.ex01;

public class Ex10 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		
		
		
		//논리연산자
		
		//&&
		System.out.println("&&연산자");
		System.out.println(true&&true); // T&T --> T
		System.out.println(true&false); //T&&F --> F
		System.out.println(false&&true); //F&&T --> F
		System.out.println(false&&false); //F&&F --> F
		
		//::
		System.out.println("||연산자");
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||true);
		System.out.println(false||false);
		
		//응용
		System.out.println("응용");
		System.out.println( (a>b)&&(a<b) ); // 5>7-->F  5<7-->T
		System.out.println( (a>b)&&(a>b) ); // 5>7--F 5>7-->T 
		System.out.println( (a<b)&&(a<b) );
		System.out.println( (a>b)||(a<b) ); // 5>7--F 5<7-->T
		
		System.out.println("! 연산자");
		System.out.println( (a>b) );  // 5>7-->F
		System.out.println( !(a>b) );  // !F-->T
		System.out.println( !(a<b) );  // !T-->F

	}

}
