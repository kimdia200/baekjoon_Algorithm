package _1;

import java.util.Scanner;

//√‚√≥ : https://www.acmicpc.net/problem/1008

public class _9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double a,b;
		do{
			a=input.nextInt();
			b=input.nextInt();
		}while((0<a&&a<10&&0<b&&b<10)==false);
		System.out.printf("%.9f",a/b);
	}

}
