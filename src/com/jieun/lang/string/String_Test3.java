package com.jieun.lang.string;

public class String_Test3 {

	public static void main(String[] args) {
		String s = "iu,suji,choa,hani";
		String [] names = s.split(",");
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
	//향상된 for문
	for(String str:names) {
		System.out.println(str);//names배열을 하나씩 꺼내서str에 넣어준다
	}
	
	
	
	}
	

}
