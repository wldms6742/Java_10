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
		char ch = number.charAt(0);
		int num = Integer.parseInt(number.substring(0,1));
		//num = Integer.parseInt(String.valueOf(ch));
		//num = Integer.parseInt(Character.toString(ch));
		//num = Integer.parseInt(ch+"");//아무런 값이 없는 문자열을 더해주면 문자열이됨
		
		int total =0;
		int k=2;
		for(int i=0;i<number.length()-1;i++) {
			if(i==6) {
				continue;//밑에를 하지않고 조건문으로 올라감
			}
			total = total + Integer.parseInt(number.charAt(i)+"")*k;
			k++;
			if(k==10) {
				k=2;
			}
			
		}
		total = total/11;
		total = 11-total;
		if(total>=10) {
			total = total%10;
		}
		int b =Integer.parseInt(number.charAt(number.length()-1)+"");
		if(b==total) {
			System.out.println("올바른 주민번호");
		}else
		{
			System.out.println("틀린 주민번호");
		}
		
		}

}
