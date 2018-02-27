package com.jieun.util.st;

import java.util.StringTokenizer;

public class St_test1 {

	public static void main(String[] args) {
		String nation = "Norway 14 14 11 German 14 10 7 Canada 11 8 10 USA 9 8 6 KOREA 5 8 4";
		
		StringTokenizer st = new StringTokenizer(nation, " ");//4개가 하나의 데이터 ->StringTokenizer 
		//4개가 하나의 nation
		Nation nation2 = null;
		while(st.hasMoreTokens()) {//더 자를 토큰이 있으면 true, 없으면 false
			//따라서 토큰이 다 자를때까지만 while문 실행
			nation2 = new Nation();
			nation2.setName(st.nextToken());
			nation2.setGold(st.nextToken());
			nation2.setSilver(st.nextToken());
			nation2.setBronze(st.nextToken());
			//배열과 달리 인덱스번호를 신경쓰지 않아도 된다. 
			String s = st.nextToken();
			System.out.println(s);
			
		}
		String names = "iu-suji-hani-choa";
		//각각 하나가 독립적인 데이터 -> split사용
		String [] a = names.split("-");
	}	

}
