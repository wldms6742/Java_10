package com.jieun.util.st.ex1;

public class WeatherView {
	
	public void view(String message) {
		System.out.println(message);
	}
	
	public void view(Weather[] ar) {
		for(Weather weather : ar) { //Weather 타입은 weather를 ar배열에서 꺼내서 for문
		this.view(weather);
		}
	
	}
	public void view(Weather weather) {
		System.out.println("지역:"+weather.getLocation());
		System.out.println("기온:"+weather.getGion());
		System.out.println("습도:"+weather.getHum());
		System.out.println("풍향:"+weather.getWind());
		
	}

}
