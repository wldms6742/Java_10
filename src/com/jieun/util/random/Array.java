package com.jieun.util.random;

public class Array {
	public int[] array(int [] ar) {
		for(int i = 0;i<ar.length;i++) {
			for(int j=0;j<i;j++) {
				if(ar[j]>ar[i]) {
					int temp = ar[j];
					ar[j]=ar[i];
					ar[i]=temp;
				}
			}
		}
		return ar;
	}
}
