package _3_For;

import java.util.Scanner;

/**
 * url : https://www.acmicpc.net/problem/2741
 * 
 * ����
 * �ڿ��� N�� �־����� ��, 1���� N���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է�
 * ù° �ٿ� 100,000���� �۰ų� ���� �ڿ��� N�� �־�����.
 * 
 * ù° �ٺ��� N��° �� ���� ���ʴ�� ����Ѵ�.
 * @author kimYS
 *
 */
public class _5 {

	public static void main(String[] args) {

		System.out.print("���� �Է� : ");
		
		Scanner sc = new Scanner(System.in);
		
		int temp = sc.nextInt();
		
		for(int i=0; i<temp; i++) {
			System.out.println(i+1);
		}

	}

}
