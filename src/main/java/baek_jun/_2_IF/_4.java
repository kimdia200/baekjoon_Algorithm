package baek_jun._2_IF;

import java.util.Scanner;

/**
 * ���� 
 * �μ� x,y�� �Է¹޾� (x, y) �� ��ǥ���Ͽ� 
 * ��4�и��� ����鿡 ���ϴ��� �Ǵ��Ͻÿ�
 * 
 * �Է�
 * ������(-1000 ~ 1000)�� �Է��Ѵ�
 * 
 * ��� 
 * ��(x,y)�� ��и� ��ȣ(1,2,3,4)�� ����Ѵ�.
 * 
 * @author family
 *
 */
public class _4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ΰ��� �Է��ϼ��� : ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x>0 && y>0)
			System.out.println("1��и�");
		else if(x<0 && y>0)
			System.out.println("2��и�");
		else if(x<0 && y<0)
			System.out.println("3��и�");
		else if(x>0 && y<0)
			System.out.println("4��и�");
		else
			System.out.println("������ ������");
	}

}
