package com.jieun.util.date;

import java.util.Calendar;
import java.util.Date;

public class Date_test3 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		
		long l = ca.getTimeInMillis();// 현재시간을 millsecond단위로 바꾼것 -> 1초를 1000으로 표현
		Date d = new Date();
		
		d.setTime(l);
		Date d2 = new Date(l);
		System.out.println(l);
		
		Calendar ca2 = Calendar.getInstance();

		ca.set(Calendar.HOUR, 11);
		ca.set(Calendar.MINUTE, 1);
		ca2.set(Calendar.MINUTE, 56);
	
		long cal1 = ca.getTimeInMillis();
		long cal2 = ca2.getTimeInMillis();
		
		System.out.println(cal1);
		System.out.println(cal2);
		System.out.println(cal1-cal2);
		
		ca.setTimeInMillis(cal1-cal2);
		System.out.println((cal1-cal2)/(1000*60));
		//생일을 날짜 설정 몇일
		ca = Calendar.getInstance();
		ca2.set(1993, 10, 26);
		
		cal1 = ca.getTimeInMillis();
		cal2 = ca2.getTimeInMillis();
		long result = cal1-cal2;
		System.out.println(result/(1000*60*60*24));//몇일이 흘렀는지
		
		
	}

}
