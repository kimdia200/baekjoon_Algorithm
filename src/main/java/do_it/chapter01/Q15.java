package do_it.chapter01;

import java.util.Scanner;

//P.40
public class Q15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.print("몇 단입니까? : ");
			num=sc.nextInt();
		}while(num<=0);
		
		//왼쪽 아래가 직각인 이등변 삼각형
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형");
		triangleLB(num);
		
		//왼쪽 위가 직각인 이등변 삼각형
		System.out.println("왼쪽 위가 직각인 이등변 삼각형");
		triangleLU(num);
		
		//오른쪽 위가 직각인 이등변 삼각형
		System.out.println("오른쪽 위가 직각인 이등변 삼각형");
		triangleRU(num);
		
		//오른쪽 아래가 직각인 이등변 삼각형
		System.out.println("오른쪽 아래가 직각인 이등변 삼각형");
		triangleRB(num);
	}
	static void triangleLB(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void triangleLU(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void triangleRU(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void triangleRB(int n) {
		for(int i=0; i<n; i++) {
			for(int j=1; j<n-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
