package com.jieun.util.st.ex1;

import java.util.Scanner;

import com.jieun.lang.string.ex1.Nation;

public class WeatherSearch {

	WeatherView view;
	Scanner sc;
	public WeatherSearch() {

		sc = new Scanner(System.in);
		view  = new WeatherView();
	}
	public Weather search(Weather [] ar) {
		Weather weather =null;
		System.out.println("검색할 지역명:");
		String name = sc.next();
		for(Weather w :ar) {
			if(name.equals(w.getLocation())) {
				weather=w;
				break;
			}

		}return weather;
	}
}

