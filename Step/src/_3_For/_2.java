package _3_For;

import java.util.Scanner;

/**
 * url : https://www.acmicpc.net/problem/10950
 * ����
 * �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
 * 
 * �Է�
 * ��� ��������
 * �ΰ��� ����
 * @author kimYS
 *
 */
public class _2 {

	public static void main(String[] args) {
		_2 t = new _2();
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("��� �������? : ");
		
		while(true) {
			num=sc.nextInt();
			if(num>0)break;
			System.out.print("����� �ƴմϴ�, �ٽ� �Է��ϼ��� : ");
		}
		
		for(int i = 0; i<num; i++) {
			System.out.print("������ �ΰ� �Է��ϼ��� : ");
			System.out.println("�� ���� �� = "+t.plus(sc.nextInt(),sc.nextInt()));
		}
		

	}
	
	public int plus(int a, int b) {
		return a+b;		
	}

}