package baek_jun._3_For;

import java.util.Scanner;
/**
 * 
 * 정수n을 입력받아 구구단 n단을 출력하세요
 */
public class _1 {

	public static void main(String[] args) {
		
		System.out.print("정수 하나를 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		
		int dan;
		
		dan = sc.nextInt();
		
		for(int i = 1 ; i<= dan ; i++) {
			System.out.println(dan+ " * " +i+ " = "+(i*dan));
			
		}

	}

}
