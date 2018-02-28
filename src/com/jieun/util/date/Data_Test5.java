package com.jieun.util.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Data_Test5 {
	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		//2018 3 2 13 20 22
		System.out.println(ca.getTime());
		
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년MM월dd일hh시mm분ss초 E요일");
		String s = sd.format(ca.getTime());
		System.out.println(s);
	}
}
