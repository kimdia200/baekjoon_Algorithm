package _3_For;

import java.util.Scanner;

/**
 * url
 * https://www.acmicpc.net/problem/8393
 * 
 * ����
 * n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է�
 * ù° �ٿ� n (1 �� n �� 10,000)�� �־�����.
 * @author kimYS
 *
 */
public class _3 {

	public static void main(String[] args) {
		_3 t = new _3();
		t.test();
	}
	
	public void test() {
		int num;
		int sum=0;
		System.out.print("1~10000 ������ ���� �Է����ּ��� : ");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			num=sc.nextInt();
			if(num>=0 &&num<=10000)
				break;
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
			System.out.print("1~10000 ������ ���� �Է����ּ��� : ");
		}
		
		for(int i=1; i<=num; i++) {
			sum+=i;
		}
		
		System.out.print("1~"+num+"������ �� : "+sum);
				
	}

}
