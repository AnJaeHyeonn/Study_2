package com.ajh.s1;

import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {
		System.out.println("==== Test9 Start ====");
		
		// 45891321467
		
		// 1 > 1
		// 2 > 2
		// 3 > 3
		// 4 > 10
		// 7 > 13
		// 8 > 20
		
		Scanner sc = new Scanner(System.in); //실행 중에 데이터를 키보드로 부터 입력받을 준비
		
		int result=0;
		int input;
		
		System.out.println("숫자를 입력하세요");
		input = sc.nextInt();
		
		result = (input/4*10) + (input%4);
		
		System.out.println("Input : "+input);		
		System.out.println("Output : "+	result);
		
		//Github 사용하기
		//Code 추가
		
		//새로운 코드 추가
		
		
	}

}
