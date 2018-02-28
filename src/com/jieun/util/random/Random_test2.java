package com.jieun.util.random;

import java.util.Random;

public class Random_test2 {
	public static void main(String[] args) {
		//로또생성기
		//1~45
		//6개번호
		int [] ar  = new int[6];
		
		for(int i=0;i<ar.length;i++) { 
			Random random = new Random();
			ar[i]=random.nextInt(45)+1;
/*			if(i==0) {
				ar[i]=num;
			}
			else if(i>0) {
				for(int j=0;j<i;j++) {
					if(ar[i]==ar[j]) {
						i--;
					}

				}
				ar[i]=num;	
			}*/	
			for(int j=0;j<i;j++) {
				if(ar[i]==ar[j]) {
					i--;
					break;
				}
			}

		}
		for(int i = 0;i<ar.length;i++) {
			for(int j=0;j<i;j++) {
				if(ar[j]>ar[i]) {
					int temp = ar[j];
					ar[j]=ar[i];
					ar[i]=temp;
				}
			}
		}
		for(int num:ar) {
			System.out.println(num);
		}
	}
}
