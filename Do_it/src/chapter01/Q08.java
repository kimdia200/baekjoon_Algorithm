package chapter01;

import java.util.Scanner;

//P.30
public class Q08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		
		for(int i=1; i<=n/2; i++) {
			sum+=i+(n+1-i);
		}
		if(n%2 != 0)
			sum+=n/2+1;
		System.out.println(sum);
	}
}
