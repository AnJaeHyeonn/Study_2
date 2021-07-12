package com.ajh.s1;

public class Test8 {
	public static void main(String[] args) {
		System.out.println("==== Test8 Start ====");
		
		int price;	//물건 값의 합계
		int money;	//손님이 낸 돈
		int don;	//거스름돈
		
		price = 57860;
		money = 100000;
		
		//물건 값의 합계보다 손님이 낸 돈이 더 많다라는 가정
		
		don = money-price;
		
		System.out.println("물건"+ " 값의 합계 : "+price);
		System.out.println("손님이 낸 돈 : "+money);
		System.out.println("거스름돈 : "+don);
		
		int man;	//만원짜리 갯수
		int cheon;	//천원짜리 갯수
		int back;	//백원짜리 갯수
		int sip;	//십원짜리 갯수
		
		man = don/10000;
		
		cheon = don/1000%10;	//cheon = (don-(man*10000))/1000;						//cheon = don/1000 - man*10;
		back = don/100%10;		//back = (don-(man*10000)-(cheon*1000))/100;			//don/100 - man*100 - cheon*10;
		sip = don/10%10;		//sip = (don-(man*10000)-(cheon*1000)-(back*100))/10;	//don/10 - man*1000 - cheon*100 - back*10;
		
		System.out.println("만원짜리 "+man+"장");
		System.out.println("천원짜리 "+cheon+"장");
		System.out.println("백원짜리 "+back+"개");
		System.out.println("십원짜리 "+sip+"개");
		
	}

}
