package baek_jun._3_For;

import java.util.Scanner;

/**
 * url: https://www.acmicpc.net/problem/11021
 * 
 * ����
 * �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է�
 * ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
 * �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
 * 
 * ���
 * �� �׽�Ʈ ���̽����� "Case #x: "�� ����� ����, A+B�� ����Ѵ�. �׽�Ʈ ���̽� ��ȣ�� 1���� �����Ѵ�.
 * @author kimYS
 *
 */
public class _7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a, b;
		int temp;
		temp = sc.nextInt();
		
		a = new int[temp];
		b = new int[temp];
		
		for(int i=0; i<temp; i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		
		for(int i=0; i<temp; i++) {
			System.out.println("Case #"+(i+1)+": "+(a[i]+b[i]));
		}
		
		
	}
}
