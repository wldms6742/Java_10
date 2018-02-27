package com.jieun.util.st.ex1;

import java.util.Scanner;

public class WeatherController {
	private Scanner sc;
	private Weather weather;
	private WeatherView weatherView;
	private WeatherInfo weatherInfo;
	
	private WeatherSearch search;
	public WeatherController() {
		sc = new Scanner(System.in);
		weather = new Weather();
		weatherView = new WeatherView();
		weatherInfo = new WeatherInfo();
		search = new WeatherSearch();
	}

	public void start() {
		Weather [] weathers = weatherInfo.getWeather();
		boolean check = true;
		while(check) {
			System.out.println("1.날씨정보출력");
			System.out.println("2.지역날씨검색");
			System.out.println("3.날씨초기화");
			System.out.println("4.프로그램종료");
			System.out.println("번호입력:");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				weatherView.view(weathers);
				break;
			case 2:
				Weather weather=search.search(weathers);
				if(weather != null) {
				weatherView.view(weather);
				}else {
					weatherView.view("해당지역정보가 없습니다");
				}
				
				break;
			case 3:
				weathers = weatherInfo.getWeather();
				break;

			default:
				check = !check;
				break;
			}

			
		}
	}
}
