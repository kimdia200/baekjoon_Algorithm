package _9_Math2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 2; i <= num; i++) {
			boolean notFound = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					notFound = false;
					break;
				}
			}
			if (i == 1)
				notFound = false;
			if (notFound || i == 2) {
				list.add(i);
			}
		}
		Outter:
		while (true) {
			for (int x : list) {
				//�������� ���� ��Ȯ�ϰ� 1������ ��
				if ((double)num / x == 1.0) {
					System.out.println(x);
					break Outter;
				}
				//�Ҽ��� �������� ������ 0�̸� while�ΰ��� �����
				else if (num % x == 0) {
					System.out.println(x);
					num = num/x;
					continue Outter;
				}
			}
		}
	}
}
