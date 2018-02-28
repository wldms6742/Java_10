package com.jieun.util.random;

import java.util.Random;

public class Random_test2 {
	public static void main(String[] args) {
		//로또생성기
		//1~45
		//6개번호
		Lotto lotto = new Lotto();
		int [] numbers = new int[6];
		int [] ar=lotto.start(numbers);
//클래스 분리해보기!
		Array array = new Array();
		array.array(ar);
		for(int num:ar) {
			System.out.println(num);
		}
	}
}
