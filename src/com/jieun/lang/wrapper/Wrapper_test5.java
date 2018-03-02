package com.jieun.lang.wrapper;

import java.util.Scanner;

public class Wrapper_test5 {

	public static void main(String[] args) {
		//주민번호
		//991222-1234567
		//3월부터 5월 출생은 봄
		//6월 부터 8월은 여름
		//9월부터 11월출생은 가을
		//12월 2월 겨울
		System.out.println("주민번호입력:");
		Scanner sc = new Scanner(System.in);
		String number = sc.next();
		
		int a = Integer.parseInt(number.substring(2, 4));
		
		if(a>2 && a<6) {
			System.out.println("봄");
		}else if(a>5 && a<9) {
			System.out.println("여름");
		}else if(a>8 && a<12) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
		//991215-1234567
		//int total = 9*2+9*3+1*4+2*5+1*6+5*7+1*8+2*9+ 3*2+4*3+5*4+6*5 
		//마지막숫자는 체크용
		//total나누기 11 몫과 나머지를 구한다 122/11 -> 몫11 나머지1(0~10)
		//나머지를 11-나머지 =>result
		//result== 마지막숫자(체크값) 같으면 올바른 주민번호 아니면 틀린주민번호 
		//결과값이 두자리라면 %10 해서 나머지값 -> 해당 나머지값과 체크값이 같은지 비교
		
		}

}
