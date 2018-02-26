package com.jieun.lang.string.ex1;

public class NationDate {
	public Nation [] makeNation() {
		String nation = "Norway 14 14 11 German 14 10 7 Canada 11 8 10 USA 9 8 6 KOREA 5 8 4";
		String [] nations = nation.split(" ");//파싱작업
		
		Nation[] ar = new Nation[nations.length/4];
		int j=0;
		for(int i=0;i<ar.length;i++)
		{
			Nation n = new Nation();
				
		n.setName(nations[j]); 
		n.setGold(nations[j+1]);//++j
		n.setSilver(nations[j+2]);//++j
		n.setBronze(nations[j+3]);//++j
		ar[i]=n;
		j=j+4;//j++
		}
		return ar;
	}
}
