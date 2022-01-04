package baek_jun._2_IF;

import java.util.Scanner;

/**
 * 문제 
 * 두수 x,y를 입력받아 (x, y) 을 좌표로하여 
 * 제4분면의 어느면에 속하는지 판단하시오
 * 
 * 입력
 * 두정수(-1000 ~ 1000)를 입력한다
 * 
 * 출력 
 * 점(x,y)의 사분면 번호(1,2,3,4)를 출력한다.
 * 
 * @author family
 *
 */
public class _4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 두개를 입력하세요 : ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x>0 && y>0)
			System.out.println("1사분면");
		else if(x<0 && y>0)
			System.out.println("2사분면");
		else if(x<0 && y<0)
			System.out.println("3사분면");
		else if(x>0 && y<0)
			System.out.println("4사분면");
		else
			System.out.println("축위에 존재함");
	}

}
