package chapter01;

import java.util.Scanner;

//P.22
public class Q04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(mid(a,b,c));
		System.out.println(midYS(a,b,c));
		
		
	}
	//중앙값을 구하는 메서드
	static int mid(int a, int b, int c) {
		//a>=b
		if(a>=b) {
			if(b>=c) //a>=b>=c
				return b;
			else if(a>=c) //a>=c>b
				return c;
			else //c>a>=b
				return a;
		}
		//b>a
		else if(a>=c) //b>a>=c
			return a;
		else if(b>=c) //b>=c>a
			return c;
		else //c>b>a
			return b;
	}
	
	static int midYS(int a, int b, int c) {
		int max = a;
		int min = a;
		
		if(max<b)
			max=b;
		if(max<c)
			max=c;
		
		if(min>b)
			min=b;
		if(min>c)
			min=c;
		
		if(!(a==max || a==min))
			return a;
		else if(!(b==max || b==min))
			return b;
		else
			return c;
	}
}
