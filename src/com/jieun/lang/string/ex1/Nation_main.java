package com.jieun.lang.string.ex1;

public class Nation_main {

	public static void main(String[] args) {
		String info = "KOREA 5 8 4";
		String [] s = info.split(" ");
		Nation n = new Nation();
		
		n.setName(s[0]);
		n.setGold(s[1]);
		n.setSilver(s[2]);
		n.setBronze(s[3]);
		
		System.out.println("국가:" + n.getName());
		System.out.println("금메달:"+n.getGold());
		System.out.println("은메달:"+n.getSilver());
		System.out.println("동메달:"+n.getBronze());
		
		NationDate nd  = new NationDate();
		NationView nv = new NationView();
		Nation [] ar  = nd.makeNation();
		nv.view(ar);
		
		NationMenu nationMenu = new NationMenu();
		nationMenu.start();
		
	
		
	}

}
