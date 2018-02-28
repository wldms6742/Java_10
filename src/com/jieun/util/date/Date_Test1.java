package com.jieun.util.date;

import java.util.*;


public class Date_Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date);
		
		Calendar ca = Calendar.getInstance();
		Date d = ca.getTime();
		System.out.println(d);
		
		int year = ca.get(Calendar.YEAR);
		System.out.println("Year:"+year);
		
		int month = ca.get(Calendar.MONTH)+1;//1이나옴 첫달을 0이라고 생각함 따라서 +1을 해줘야한다
		System.out.println("Month:"+month);
		
		int day = ca.get(Calendar.DATE);
		System.out.println("Day :"+day);
		
		int e = ca.get(Calendar.DAY_OF_WEEK);
		System.out.println(e+"일");
		
		int hour = ca.get(Calendar.HOUR);
		System.out.print(hour+"h");
		//hour_of_day : 24시간 형식, hour :12시간 형식
		int minute = ca.get(Calendar.MINUTE);
		System.out.print(minute+"m");
		
		int seconds = ca.get(Calendar.SECOND);
		System.out.println(seconds+"s");
	
		int a = ca.get(Calendar.AM_PM);
		System.out.println(a);
		
		int a1 = ca.get(Calendar.AM);
		System.out.println(a1);
		
		int a2 = ca.get(Calendar.PM);
		System.out.println(a2);
	}

}
