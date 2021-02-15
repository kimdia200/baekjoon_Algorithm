package chapter02;

import java.util.Arrays;

public class Q05 {
	static void rcopy(int[] a, int[] b) {
		for (int i = 0; i < b.length; i++) {
			a[i] = b[b.length-1-i];
		}
	}
	
	public static void main(String[] args) {
		int[] a= {0,0,0,0,0};
		int[] b = {1,2,3,4,5};
		rcopy(a,b);
		System.out.println("a의 배열 값 : " + Arrays.toString(a));
	}
}
