package baek_jun._3_For;

import java.util.Scanner;
/**
 * 
 * ����n�� �Է¹޾� ������ n���� ����ϼ���
 */
public class _1 {

	public static void main(String[] args) {
		
		System.out.print("���� �ϳ��� �Է��ϼ��� : ");
		
		Scanner sc = new Scanner(System.in);
		
		int dan;
		
		dan = sc.nextInt();
		
		for(int i = 1 ; i<= dan ; i++) {
			System.out.println(dan+ " * " +i+ " = "+(i*dan));
			
		}

	}

}
