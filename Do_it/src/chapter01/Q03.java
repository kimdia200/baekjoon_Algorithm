package chapter01;

import java.util.Scanner;

//P.19
public class Q03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int d= sc.nextInt();
		
		System.out.println(min4(a,b,c,d));
	}
	
	//네값의 최솟값을 구하는 min4메서드를 작성하세요
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if(min>b)
			min=b;
		if(min>c)
			min=c;
		if(min>d)
			min=d;
		return min;
	}
}
