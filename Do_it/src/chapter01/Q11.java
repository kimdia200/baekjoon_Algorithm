package chapter01;

import java.util.Scanner;

//P.33
public class Q11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			num=sc.nextInt();
		}while(num<=0);
		
		int i=1;
		while(true) {
			if(num/i == 0)
				break;
			i*=10;
		}
		String s = Integer.toString(i/=10);
		System.out.println("그 수는 "+s.length()+"자리 입니다.");
	}
}
