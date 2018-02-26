package com.jieun.lang.string.ex1;

import java.util.Scanner;

public class NationSearch {
	private Scanner sc;
	public NationSearch() {
		sc = new Scanner(System.in);
	}
	public Nation search(Nation [] ar) {//ar에서 꺼내면 Nation타입 String타입이아니다
		System.out.println("나라이름을 입력");
		Nation n = null;
		String name = sc.next();
		for(Nation nation:ar) {
			if(name.equals(nation.getName())) {
				n=nation;
				break;
			}
			
		}
		return n;
	}
}
 