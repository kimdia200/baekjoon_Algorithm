package baek_jun._1;

//��ó: https://www.acmicpc.net/problem/2588

import java.util.Scanner;

public class _12 {
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a,b;
		
		a=input.nextInt();
		b=input.nextInt();
		
		int temp1,temp2,temp3,last;
		
		temp1 = (b%10)*a;
		temp2 = (b/10%10)*a;
		temp3 = (b/100)*a;
		last = temp1+temp2*10+temp3*100;
		
		System.out.println(temp1);
		System.out.println(temp2);
		System.out.println(temp3);
		System.out.println(last);
	}
}
