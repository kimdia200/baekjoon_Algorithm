package baek_jun._2_IF;

import java.util.Scanner;

/**
 * 
 * ���� : �� ���� A�� B�� �־����� ��, A�� B�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Է� : ù° �ٿ� A�� B�� �־�����. A�� B�� ���� �� ĭ���� ���еǾ��� �ִ�.
 * ��� : 
 * ù° �ٿ� ���� �� ���� �� �ϳ��� ����Ѵ�.
	A�� B���� ū ��쿡�� '>'�� ����Ѵ�.
	A�� B���� ���� ��쿡�� '<'�� ����Ѵ�.
	A�� B�� ���� ��쿡�� '=='�� ����Ѵ�.
	
	�� ���� ��ĳ�ʷ� �Է¹ްڽ��ϴ�.
 */
public class _1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.print("ù��° ���� : ");
		a = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		b = sc.nextInt();
		
		if(a>b)
			System.out.println(a + " > "+b);
		else if(a<b)
			System.out.println(a + " < " +b);
		else
			System.out.println(a + " = " +b);
		
	}

}