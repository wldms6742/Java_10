package com.jieun.util.date;

import java.util.Calendar;

public class Date_Test2 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		Calendar cur = Calendar.getInstance();
		
		ca.set(Calendar.YEAR, 2000);
		System.out.println(ca.get(Calendar.YEAR)); //년도 변경됨
		
		ca.set(Calendar.MONTH, 11);
		System.out.println(ca.get(Calendar.MONTH));
		
		ca.set(1997, 10, 13);
		System.out.println(ca.getTime());
		
		
	}

}
