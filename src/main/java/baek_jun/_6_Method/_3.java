package baek_jun._6_Method;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1065
 * 
 */
public class _3 {
	public static void main(String[] args) {
		_3 t = new _3();
		Scanner sc = new Scanner(System.in);
		System.out.println(t.hansu(sc.nextInt()));
	}
	
	public int hansu(int num) {
		int count=0;
		
		for (int i = 1; i <= num; i++) {
			if(i<100) {
				count++;
				continue;
			}
			int num1 = i/100;
			int num2 = i/10%10;
			int num3 = i%10;
			
			if((num1-num2)==(num2-num3)) {
				count++;
			}
		}
		return count;
	}
}
