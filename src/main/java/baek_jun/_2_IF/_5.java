package baek_jun._2_IF;

import java.util.Scanner;

/**����
 * â���̴� �����ð����� 45������ �˶��� �س��´�
 * ������� �˶��ð��� �Է¹޾����� â������ ������� �˶��� ����غ�����
 * 
 * �Է�
 * ������� �˶��ð��� �Է¹޴´� ���� �ΰ�(�ð�, ��)
 * �ð��� ����
 * 0<=H<=23
 * 0<=M<=59
 * 
 * ���
 * �Է°� �����ϰ� ���� �ΰ��� �����
 * 
 */
public class _5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h,m;
		
		System.out.print("������� �˶��ð��� �Է��ϼ���(���� �ΰ�, �� ��) : ");
		h=sc.nextInt();
		m=sc.nextInt();
		
		if((m-45)<0) {
			m+=15;
			if((h-1)<0)
				h=23;
			else
				h--;
		}else
			m-=45;
		
		System.out.println("������� �� �˸��ð� : "+h+"�� " + m+"��!!!!");
	}
}
