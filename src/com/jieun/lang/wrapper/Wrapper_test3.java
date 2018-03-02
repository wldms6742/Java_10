package com.jieun.lang.wrapper;

import java.util.Scanner;

public class Wrapper_test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);



		//비밀번호체크
		//최소한 두개이상의 소문자
		//최소한 두개이상의 대문자
		//최소한 두개이상의 숫자  
		//공백이 포함되면 안됨
		//최소 8글자이상이어야한다.
		int low = 0;
		int up = 0;
		int num = 0;
		int count = 0;
		boolean check = true;
		System.out.println("비밀번호를 입력하세요");
		String pw = sc.next();
		count = pw.length();
		for(int i=0;i<pw.length();i++) {
			char ch = pw.charAt(i);
			if(Character.isUpperCase(ch)) {
				up++;
			}else if(Character.isLowerCase(ch)) {
				low++;
			}else if(Character.isDigit(ch)) {
				num++;
			}else if(Character.isWhitespace(ch)) {
				check = false;
				break;
			}
		}
		if(up>1&&low>1&&num>1&&count>7&&check==true) {
			System.out.println("OK");
		}else {
			System.out.println("Fail");
		}
	}
//배열 사용시
	//char [] ch = pw.toCharArray();
	
}
