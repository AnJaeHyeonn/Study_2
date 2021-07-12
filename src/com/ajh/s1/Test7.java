package com.ajh.s1;

public class Test7 {
	public static void main(String[] args) {
		System.out.println("==== Test7 Start ====");
		
		int kor = 56;
		int eng = 65;
		int math = 49;
		
		int total = kor + eng + math;
		
		double avg = total/3.0;
		
		System.out.println("Total : "+total);
		System.out.println("Avg : "+avg);
		
		avg = avg*100;
		int result = (int)avg;
		avg = result/100.0;
		
		//위에 3줄을 압축하면 아래것
		//avg = (int)(avg*100)/100.0;
		
		kor = 100;
		
		System.out.println("Total : "+total);
		System.out.println("Avg : "+avg);
		
	}

}
