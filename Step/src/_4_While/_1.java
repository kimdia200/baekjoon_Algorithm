package _4_While;

import java.util.Scanner;

/**
 * URL : https://www.acmicpc.net/problem/10952
 * 
 * ���� : �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է� : �Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
 * 		�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
 * 		�Է��� ���������� 0 �� ���� ���´�.
 * 
 * @author kimYS
 *
 */
public class _1 {

	public static void main(String[] args) {
			
		int a,b;
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			a=sc.nextInt();
			b=sc.nextInt();
			
			if(a==0 && b==0)
				break;
			System.out.println(a+b);
			
		}

	}

}
