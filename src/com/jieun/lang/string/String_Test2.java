package com.jieun.lang.string;

import java.util.Scanner;

public class String_Test2 {

	public static void main(String[] args) {
		String s = "iu";// = new String(iu) 새로운 객체 만드는 것과 같은 뜻
		Scanner sc  = new Scanner(System.in);
		String str = "iu";
		String str2 = new String("iu");
		String str3 = new String("iu");
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj1==obj2);//false 주소값 물어보는 것
		System.out.println(obj1.equals(obj2));//두개의 주소값을 물어보는 것이므로 false
		
		System.out.println(s.equals(str));//true 문자열의 값이 같은지 아닌지 비교할때는 equals메서드 사용
		System.out.println(s==str);//true
		
		//indexOf(int ch) 0번 인덱스부터 찾음
		String s4 = "seoulhello";
		int i = s4.indexOf('o');//왼쪽부터 시작해서o를 찾으면 종료 따라서 2가 출력됨
		System.out.println(i); //못찾은 경우는-1
		
		//indexOf(int ch, int fromIndex) 내가 지정한 인덱스부터(지정한인덱스포함) 찾는다
		int a = s4.indexOf('o',9);//시작 인덱스 지정
		System.out.println(a);
		
		
		int count = 0;
		int index = 0;
		
		while(index != -1) {
			index = s4.indexOf('l', index);
			if(index != -1) {
				count++;
				index++;
			}else {
				break;
			}

		}

		System.out.println(count+"개");
	
		String s5 = "lgnotebook";
		index = s5.indexOf("note"); //앞에서 note가 들어간 인덱스 찾는
		System.out.println(index);
		
		String [] files = {"jpg","png","gif"};
		
		s4 = "suji.iu.gif";
		//이미지 파일여부 판단
		for(int i1= 0;i1<s4.length();i1++) {
			System.out.println(s4.charAt(i1));
		}
		s4 = s4.replace('.', '_');
		System.out.println(s4);
		
		
	}
	

}
