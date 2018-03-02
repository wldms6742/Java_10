package com.jieun.util.st.ex1;

import java.util.StringTokenizer;

public class WeatherInfo {
	private String weatherinfo;
	Weather weather;
	Weather [] ar;
	public Weather[] getWeather() {
		//지역, 온도, 습도, 풍향
		
		weatherinfo = "seoul,10,50,남서,busan,32,80,남동,daegu,-22,10,북서,jeju,-32,75,북동";
		StringTokenizer st = new StringTokenizer(weatherinfo, ",");
		ar = new Weather[st.countTokens()/4];
		
		for(int i =0 ; i<st.countTokens();i++) {
			
			weather = new Weather();
			weather.setLocation(st.nextToken());
			weather.setGion(Integer.parseInt(st.nextToken()));
			weather.setHum(Integer.parseInt(st.nextToken()));
			weather.setWind(st.nextToken());
			ar[i]=weather;
		}
		
		return ar;
	
	}
}
