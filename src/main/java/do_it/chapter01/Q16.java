package do_it.chapter01;

import java.util.Scanner;

//P.40
public class Q16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		spira(num);
	}
	
	static void spira(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<=n/2-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i*2+1; j++) {
				System.out.print("*");
			}
			for(int j=0; j<=n/2-i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
