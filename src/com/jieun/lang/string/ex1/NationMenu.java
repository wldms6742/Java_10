package com.jieun.lang.string.ex1;

import java.util.Scanner;

public class NationMenu {
	private Nation [] nations;
	private Scanner sc;
	public void start() {
		//1.나라정보출력
		//2.나라정보검색
		//- 검색할 나라의 이름을 입력하세요
		//-NationsSearch라는 클래스에 search라는 메서드 실행 
		//출력은 Nationview에 view메서드에서 출력
 		//3.프로그램종료
		sc  = new Scanner(System.in);
		NationView nationView = new NationView();
		NationDate nationDate = new NationDate();
		NationSearch nationSearch = new NationSearch();
		nations = nationDate.makeNation();
		boolean check = true;
		while(check) {
		
			System.out.println("1. 나라정보출력");
			System.out.println("2. 나라정보검색");
			System.out.println("3. 프로그램종료");
			
			int select = sc.nextInt();
	
			switch (select) {
			case 1:
				nationView.view(nations);
				break;
			case 2:
				Nation nation=nationSearch.search(nations);
				if(nation != null) {
				nationView.view(nation);
				}else {
					nationView.view("찾는국가가 없습니다");
					
				}
				break;

			default:
				System.out.println("종료합니다");
				check = false;
				break;
			}
		}
	}
}
