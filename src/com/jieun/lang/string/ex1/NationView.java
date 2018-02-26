package com.jieun.lang.string.ex1;

public class NationView {
	
	public void view(String message) {
		System.out.println(message);
	}//못찾았을떄
	public void view(Nation nation) {
		System.out.println("================");
		System.out.println("Name : "+nation.getName());
		System.out.println("Gold : "+nation.getGold());
		System.out.println("Silver : "+nation.getSilver());
		System.out.println("Bronze : "+nation.getBronze());
	}
	public void view(Nation [] ar) {
		for(Nation nation:ar) {
			this.view(nation);
		}
	}
}
