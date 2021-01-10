package _6_Method;

import java.util.Scanner;

/**
 * URL:  https://www.acmicpc.net/problem/15596
 *
 */
//정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
//작성해야 하는 함수는 다음과 같다.

public class _1 {
	public static void main(String[] args) {
		_1 t = new _1();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇개를 받을까요? ");
		
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("정수 입력 : ");
			arr[i]=sc.nextInt();
		}
		System.out.println("정수의 합 : " + t.sum(arr));
	}
	
//	Java: long sum(int[] a);
//	a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열
//	리턴값: a에 포함되어 있는 정수 n개의 합
	public long sum(int[] a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
}
