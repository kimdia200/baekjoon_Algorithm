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
		
		//a.add(b) 실행시 객체 a에 b를 더한값이 저장되는것이 아니라
		//a에 b를 더한값이 리턴되는것이다.
		BigInteger result = a.add(b);
		
		System.out.println(result);
	}
}
