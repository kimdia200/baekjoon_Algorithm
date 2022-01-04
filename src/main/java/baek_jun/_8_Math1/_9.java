package baek_jun._8_Math1;

import java.util.Scanner;

/**
 * URL: https://www.acmicpc.net/problem/1011
 * @author eksoo
 *
 */
public class _9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		_9 t = new _9();
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			t.test();
		}
	}
	public void test() {
		Scanner sc = new Scanner(System.in);
		int pos=1;
		int x = sc.nextInt();
		int y = sc.nextInt();
		int len = y-x;
		
		if(len==1) {
			System.out.println(1);
			return;
		}
		while(true) {
			if(len>pos*pos)
				pos++;
			else
				break;
		}
		
//		System.out.println("거리범위 : "+((pos-1)*(pos-1)+1)+"~"+pos*pos );
		if(len-(pos-1)*(pos-1)>=(double)(pos*2-1)/2)
			System.out.println(pos*2-1);
		else
			System.out.println(pos*2-2);
	}
}
