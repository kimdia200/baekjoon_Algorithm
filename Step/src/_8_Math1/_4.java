package _8_Math1;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2869
 *
 */
public class _4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		
		
		int day = 1;
		
		while(true) {
			v-=a;
			if(v<=0)
				break;
			else {
				v+=b;
				day++;
			}	
		}
		System.out.println(day+"일 걸립니다.");
		
	}
}
