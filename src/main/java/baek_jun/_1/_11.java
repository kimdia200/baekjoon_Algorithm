package baek_jun._1;

import java.util.Scanner;

//√‚√≥: https://www.acmicpc.net/problem/10430
public class _11 {
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a,b,c;
		
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		
		System.out.println((a+b)%c);
		System.out.println((a%c+b%c)%c);
		System.out.println((a*b)%c);
		System.out.println((a%c*b%c)%c);
	}
}
