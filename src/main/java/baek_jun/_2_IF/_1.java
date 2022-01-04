package baek_jun._2_IF;

import java.util.Scanner;

/**
 * 
 * 문제 : 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
 * 출력 : 
 * 첫째 줄에 다음 세 가지 중 하나를 출력한다.
	A가 B보다 큰 경우에는 '>'를 출력한다.
	A가 B보다 작은 경우에는 '<'를 출력한다.
	A와 B가 같은 경우에는 '=='를 출력한다.
	
	두 수는 스캐너로 입력받겠습니다.
 */
public class _1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.print("첫번째 정수 : ");
		a = sc.nextInt();
		System.out.print("두번째 정수 : ");
		b = sc.nextInt();
		
		if(a>b)
			System.out.println(a + " > "+b);
		else if(a<b)
			System.out.println(a + " < " +b);
		else
			System.out.println(a + " = " +b);
		
	}

}
