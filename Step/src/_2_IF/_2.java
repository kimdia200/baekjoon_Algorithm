package _2_IF;
/**
 * ���� : 
 * ���� ������ �Է¹޾� 
 * 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է� : 
 * ù° �ٿ� ���� ������ �־�����. ���� ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
 * 
 * ��� : 
 * ���� ������ ����Ѵ�.
 */
import java.util.Scanner;

public class _2 {
public static void main(String[] args) {
		
		int temp;
		Scanner sc = new Scanner(System.in);
		
		//���������� 0~100���̹Ƿ� �Է¹޴� ������ ���� �����˻�� ��������
		System.out.print("���� ������ �Է��ϼ��� : ");
		temp = sc.nextInt();
	
		if(temp>=90)
			System.out.println("A");
		else if(temp>=80)
			System.out.println("B");
		else if(temp>=70)
			System.out.println("C");
		else if(temp>=60)
			System.out.println("D");
		else
			System.out.println("F");
		
	}

}
