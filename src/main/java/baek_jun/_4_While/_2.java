package baek_jun._4_While;

import java.util.Scanner;

/**
 * URL : https://www.acmicpc.net/problem/1110
 * 
 * ���� 
 * 0���� ũ�ų� ����, 99���� �۰ų� ���� ������ �־��� �� ������ ���� ������ �� �� �ִ�. 
 * ���� �־��� ���� 10���� �۴ٸ� �տ� 0�� �ٿ� �� �ڸ� ���� �����, �� �ڸ��� ���ڸ� ���Ѵ�.
 * �� ����, �־��� ���� ���� ������ �ڸ� ���� �տ��� ���� ���� ���� ������ �ڸ� ���� �̾� ���̸� ���ο� ���� ���� �� �ִ�.
 * ���� ���� ����.
 * 26���� �����Ѵ�. 2+6 = 8�̴�. ���ο� ���� 68�̴�. 6+8 = 14�̴�. ���ο� ���� 84�̴�. 8+4 = 12�̴�. ���ο� ���� 42�̴�. 4+2 = 6�̴�. ���ο� ���� 26�̴�.

���� ���� 4������ ���� ���� ���ƿ� �� �ִ�. ���� 26�� ����Ŭ�� ���̴� 4�̴�.

N�� �־����� ��, N�� ����Ŭ�� ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * @author kimYS
 *
 */
public class _2 {
	public static void main(String[] args) {
		
		int input, front, back, sum=-1;
		Scanner sc = new Scanner(System.in);

		
		System.out.print("0�̻� 99������ ���� �Է� : ");
		input = sc.nextInt();
		
		int count=0;
		sum=input;
		System.out.println(sum);
		if(input<10)
			sum=input*10;
		else
			sum=input;
		do{
			front = sum/10;
			back = sum%10;
			sum=back*10 + (front+back)%10;
			System.out.print(front+"+"+back +"="+(front+back)+"�̴�. ���ο� ���� "+sum+"�̴�. ");
			count++;
		}while(input!=sum);
		System.out.println(count);
		
	
		
		
	}
}
