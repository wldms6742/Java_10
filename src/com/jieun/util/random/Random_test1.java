package com.jieun.util.random;

import java.util.Calendar;
import java.util.Random;

public class Random_test1 {

	public static void main(String[] args) {
		//Random r = new Random();//new Random(long seed) seed 
		//가짜 패턴이 존재 seed를 지정해줘서 난수로 나오게한다
		Calendar ca = Calendar.getInstance();
		//Random r = new Random(ca.getTimeInMillis());
		Random r = new Random();
		r.setSeed(ca.getTimeInMillis());//
		int num = r.nextInt();//정수중에서 랜덤한 수를 준다 int가 가질수있는 모든수
		System.out.println(num);
		
		num = r.nextInt(4);
		System.out.println(num);//매개변수까지 랜덤하게 숫자가 나온다
	}

}
