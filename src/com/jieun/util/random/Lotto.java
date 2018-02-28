package com.jieun.util.random;

import java.util.Random;

public class Lotto {
	private int [] numbers;
	public Lotto() {
		numbers = new int[6];
	}
	public int[] start(int[] numbers) {
		for(int i=0;i<numbers.length;i++) { 
			Random random = new Random();
			numbers[i]=random.nextInt(45)+1;

			for(int j=0;j<i;j++) {
				if(numbers[i]==numbers[j]) {
					i--;
					break;
				}
			}

		}return numbers;
	}
}
