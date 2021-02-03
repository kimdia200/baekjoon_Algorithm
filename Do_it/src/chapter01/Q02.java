package chapter01;

import java.util.Scanner;

//P.19
public class Q02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		
		System.out.println(min3(a,b,c));
	}
	
	//세값의 최솟값을 구하는 min3메서드를 작성하세요
	static int min3(int a, int b, int c) {
		int min = a;
		if(min>b)
			min=b;
		if(min>c)
			min=c;
		return min;
	}
}
