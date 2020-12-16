package _3_For;

import java.util.Scanner;

/**
 * url
 * https://www.acmicpc.net/problem/8393
 * 
 * 문제
 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 * 
 * 입력
 * 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
 * @author kimYS
 *
 */
public class _3 {

	public static void main(String[] args) {
		_3 t = new _3();
		t.test();
	}
	
	public void test() {
		int num;
		int sum=0;
		System.out.print("1~10000 사이의 수를 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			num=sc.nextInt();
			if(num>=0 &&num<=10000)
				break;
			System.out.println("잘못 입력하셨습니다");
			System.out.print("1~10000 사이의 수를 입력해주세요 : ");
		}
		
		for(int i=1; i<=num; i++) {
			sum+=i;
		}
		
		System.out.print("1~"+num+"까지의 합 : "+sum);
				
	}

}
