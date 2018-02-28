package com.jieun.util.random;

public class Random_Controller {
		public void view() {
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
