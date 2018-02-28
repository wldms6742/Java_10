package com.jieun.util.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date_test6 {

	public static void main(String[] args) throws ParseException {
		String s = "2017-10-9";
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		//문자열을 날짜로 바꿔주는 작업
		Date date = sd.parse(s);
		
		Calendar ca = Calendar.getInstance();
		ca.setTime(date);
		
		ca.setTimeInMillis(date.getTime());//date타입을 long으로 바꿔서 넣어준다
		
		System.out.println(ca.getTime());
		
		System.out.println(sd.format(date));
		
		
	}

}
