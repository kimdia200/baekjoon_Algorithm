package do_it.chapter01;

import java.util.Scanner;

public class Q09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(sumof(a,b));
	}
	static int sumof(int a, int b) {
		int temp;
		if(a>b) {
			temp=a;
			a=b;
			b=temp;
		}
		
		int sum=0;
		for(int i=a; i<=b; i++) {
			sum+=i;
		}
		return sum;
	}
}
