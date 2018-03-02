package com.jieun.lang.wrapper;

public class Wrapper_test2 {

	public static void main(String[] args) {
		int num=10;
		String s = "5";
		Integer n1 = new Integer(num);//wrapper클래스
		Integer n2  = new Integer(s);//문자열도 Integer클래스로변경
		
		System.out.println(n1.intValue()*10);
		System.out.println(n2.intValue()*10);//문자열로된 숫자를 int로 바꿈
		
		System.out.println(Integer.toBinaryString(1));
		System.out.println(Integer.toBinaryString(-1));
		
		int n3 = Integer.parseInt(s);
		System.out.println(n3);//문자열로된 숫자를 primitive타입으로 변경해줌
		
		double d1 = Double.parseDouble("4.53");
		System.out.println(d1*10);
	}

}
