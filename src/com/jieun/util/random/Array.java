package com.jieun.util.random;

public class Array {
	public int[] array(int [] ar) {
/*		for(int i = 0;i<ar.length;i++) {
			for(int j=0;j<i;j++) {
				if(ar[j]>ar[i]) {
					int temp = ar[j];
					ar[j]=ar[i];
					ar[i]=temp;
				}
			}
		}*/
		for(int i = 0;i<ar.length-1;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					int temp = ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
					
				}
			}
		}
		return ar;
	}
}
