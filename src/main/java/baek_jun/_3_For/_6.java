package baek_jun._3_For;

import java.util.Scanner;

/**
 * url : https://www.acmicpc.net/problem/2742
 * 
 * ���� �ڿ��� N�� �־����� ��, N���� 1���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է� ù° �ٿ� 100,000���� �۰ų� ���� �ڿ��� N�� �־�����.
 * 
 * ��� ù° �ٺ��� N��° �� ���� ���ʴ�� ����Ѵ�.
 * 
 * @author kimYS
 *
 */
public class _6 {

	public static void main(String[] args) {

		System.out.print("���� �Է� : ");

		Scanner sc = new Scanner(System.in);

		int temp = sc.nextInt();
		
		for(int i=temp; i>0; i-- ) {
			System.out.println(i);
		}

	}

}
