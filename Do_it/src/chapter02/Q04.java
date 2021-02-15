package chapter02;

import java.util.Arrays;

public class Q04 {
	static void copy(int[] a, int[] b) {
		for(int i=0; i<b.length; i++) {
			a[i] = b[i];
		}
	}
	
	public static void main(String[] args) {
		int[] a= {0,0,0,0,0};
		int[] b = {1,2,3,4,5};
		copy(a,b);
		System.out.println("a의 배열 값 : " + Arrays.toString(a));
	}
}
