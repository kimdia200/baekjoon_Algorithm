package baek_jun._7_String;

import java.util.Scanner;

public class _1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("���ĺ� or ����(0-9) �� �ϳ��� �Է��ϼ��� : ");
		char temp = sc.next().charAt(0);
		
		if((temp>='a'&&temp<='z') || (temp>='A'&& temp<='Z') || (temp>='0'&&temp<='9'))
			System.out.println((int)temp);
		else
			System.out.println("���ĺ� or ���ڰ� �ƴմϴ�.");
	}
}
