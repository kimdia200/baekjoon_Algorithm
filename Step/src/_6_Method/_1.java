package _6_Method;

import java.util.Scanner;

/**
 * URL:  https://www.acmicpc.net/problem/15596
 *
 */
//���� n���� �־����� ��, n���� ���� ���ϴ� �Լ��� �ۼ��Ͻÿ�.
//�ۼ��ؾ� �ϴ� �Լ��� ������ ����.

public class _1 {
	public static void main(String[] args) {
		_1 t = new _1();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� �������? ");
		
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("���� �Է� : ");
			arr[i]=sc.nextInt();
		}
		System.out.println("������ �� : " + t.sum(arr));
	}
	
//	Java: long sum(int[] a);
//	a: ���� ���ؾ� �ϴ� ���� n���� ����Ǿ� �ִ� �迭
//	���ϰ�: a�� ���ԵǾ� �ִ� ���� n���� ��
	public long sum(int[] a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
}
