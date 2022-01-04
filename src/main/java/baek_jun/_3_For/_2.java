package baek_jun._3_For;

import java.util.Scanner;

/**
 * url : https://www.acmicpc.net/problem/10950
 * 문제
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오
 * 
 * 입력
 * 몇번 돌릴건지
 * 두개의 정수
 * @author kimYS
 *
 */
public class _2 {

	public static void main(String[] args) {
		_2 t = new _2();
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("몇번 돌릴까요? : ");
		
		while(true) {
			num=sc.nextInt();
			if(num>0)break;
			System.out.print("양수가 아닙니다, 다시 입력하세요 : ");
		}
		
		for(int i = 0; i<num; i++) {
			System.out.print("정수를 두개 입력하세요 : ");
			System.out.println("두 수의 합 = "+t.plus(sc.nextInt(),sc.nextInt()));
		}
		

	}
	
	public int plus(int a, int b) {
		return a+b;		
	}

}
