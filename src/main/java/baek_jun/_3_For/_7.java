package baek_jun._3_For;

import java.util.Scanner;

/**
 * url: https://www.acmicpc.net/problem/11021
 * 
 * 문제
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 
 * 입력
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 
 * 출력
 * 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
 * @author kimYS
 *
 */
public class _7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a, b;
		int temp;
		temp = sc.nextInt();
		
		a = new int[temp];
		b = new int[temp];
		
		for(int i=0; i<temp; i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		
		for(int i=0; i<temp; i++) {
			System.out.println("Case #"+(i+1)+": "+(a[i]+b[i]));
		}
		
		
	}
}
