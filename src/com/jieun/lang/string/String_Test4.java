package com.jieun.lang.string;

public class String_Test4 {

	public static void main(String[] args) {
		String n = "oracle";
		n= n.substring(2);//시작번호부터 끝까지를 잘라온다
		System.out.println(n);
		
		n = "bugerking";
		n=n.substring(1, 3);//특정한 인덱스번호 사이의 문자열출력
		System.out.println(n);//beginindex는 포함, endindex는 포함x (1<= n <3)
	
		n= " Buger King ";
		System.out.println(n.equals("Buger King")); //앞뒤의 공백때문에 falses가 나옴
		
		String n2=n.trim();//앞뒤의 공백을 지워줌
		System.out.println("Test"+n+"price");
		System.out.println("Test"+n2+"price");
		
		String str = String.valueOf(20);//static변수는 클래스이름.메서드명으로 호출
		System.out.println(str);//20이란 숫자를 문자열20으로 바꿔줌
		
		
	}

}
