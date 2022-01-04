package baek_jun._2_IF;

import java.util.Scanner;

/**문제
 * 창영이는 원래시각보다 45분일찍 알람을 해놓는다
 * 상근이의 알람시간을 입력받았을때 창영이의 방식으로 알람을 출력해보세요
 * 
 * 입력
 * 상근이의 알람시간을 입력받는다 정수 두개(시간, 분)
 * 시간의 범위
 * 0<=H<=23
 * 0<=M<=59
 * 
 * 출력
 * 입력과 동일하게 정수 두개를 출력함
 * 
 */
public class _5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h,m;
		
		System.out.print("상근이의 알람시간을 입력하세요(정수 두개, 시 분) : ");
		h=sc.nextInt();
		m=sc.nextInt();
		
		if((m-45)<0) {
			m+=15;
			if((h-1)<0)
				h=23;
			else
				h--;
		}else
			m-=45;
		
		System.out.println("상근이의 새 알림시간 : "+h+"시 " + m+"분!!!!");
	}
}
