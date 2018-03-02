package com.jieun.lang.wrapper;

public class Wrapper_test4 {

	public static void main(String[] args) {
		int num = 10;
		Integer n1 = new Integer(num);//박싱
		num = n1.intValue();//언박싱
		
		//autoBoxing
		n1 = num;//타입이 다르지만 자동으로 바꿔준다
		
		//autoUnBoxing
		num = n1;
		
		System.out.println(n1);
		double d  = n1;//오토언박싱이 생기면서 자동으로 형 변환된다
		n1  = (int)	d;
		Double d1 = d;
		//n1  = (int)d1;//d1을 참조변수n1에 넣으라고 해서 오토언박싱X
		n1 =(int)(d1.doubleValue());
		
		String s = "3";
		
	}

}
