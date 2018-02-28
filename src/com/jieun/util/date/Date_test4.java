package com.jieun.util.date;

import java.util.Calendar;

public class Date_test4 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		
		//3일 뒤 도착예정입니다 ->몇월몇일인지 출력
		long cal1  = ca.getTimeInMillis();
		cal1 = cal1 + 1000*60*60*24*3;
		
		ca.setTimeInMillis(cal1);
		
		System.out.println(ca.getTime());
		
		ca.set(2018, 2, 29);
		System.out.println(ca.getTime());
		ca.roll(Calendar.DATE, 3); //roll은 달이 넘어갈때 바뀌지않음 상위단위까지 변경이 안됨
		System.out.println(ca.getTime());
	
		ca.set(2018, 2, 29);
		System.out.println(ca.getTime());
		
		ca.add(Calendar.DATE, 3);//add상위단위까지도 변경가능
		System.out.println(ca.getTime());
		
		
	}

}
