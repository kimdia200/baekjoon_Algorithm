package chapter01;

import java.util.Scanner;

//P.33
public class Q10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("a의 값:");
		a=sc.nextInt();
		while(true) {
			System.out.print("b의 값:");
			b=sc.nextInt();
			if(b>a)
				break;
			System.out.println("a보다 큰 값을 입력하세요!");
		}
		System.out.println("b-a는"+(b-a)+"입니다.");
	}
}
