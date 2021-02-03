package chapter01;

import java.util.Scanner;

//P.19
public class Q01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int d= sc.nextInt();
		
		System.out.println(max4(a,b,c,d));
		
	}
	//네값의 최댓값을 구하는 max4 메서드를 작성하세요
	static int max4(int a, int b, int c, int d) {
		int max =a;
		if(max<b)
			max=b;
		if(max<c)
			max=c;
		if(max<d)
			max=d;
		return max;
	}
}
