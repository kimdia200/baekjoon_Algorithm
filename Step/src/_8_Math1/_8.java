package _8_Math1;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * URL: https://www.acmicpc.net/problem/10757
 * @author eksoo
 *
 */
public class _8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = new BigInteger(sc.next());
		BigInteger b = new BigInteger(sc.next());
		
		//a.add(b) ����� ��ü a�� b�� ���Ѱ��� ����Ǵ°��� �ƴ϶�
		//a�� b�� ���Ѱ��� ���ϵǴ°��̴�.
		BigInteger result = a.add(b);
		
		System.out.println(result);
	}
}
