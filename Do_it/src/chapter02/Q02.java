package chapter02;

import java.util.Arrays;

public class Q02 {
	static void swap(int[] a, int idx1, int idx2) {
		int temp=a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
		System.out.println("a["+idx1+"]과(와) a["+idx2+"]를 교환합니다.");
	}
	
	static void reverse(int[] a) {
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length/2; i++) {
			swap(a,i,a.length-1-i);
			System.out.println(Arrays.toString(a));
		}
		System.out.println("역순 정렬을 마쳤습니다.");
	}
	
	public static void main(String[] args) {
		int[] a = new int[] {5,10,73,2,-5,42};
		reverse(a);
	}
}
