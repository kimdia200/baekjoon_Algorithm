package baek_jun._7_String;

import java.util.Scanner;

public class _1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("알파벳 or 숫자(0-9) 중 하나를 입력하세요 : ");
		char temp = sc.next().charAt(0);
		
		if((temp>='a'&&temp<='z') || (temp>='A'&& temp<='Z') || (temp>='0'&&temp<='9'))
			System.out.println((int)temp);
		else
			System.out.println("알파벳 or 숫자가 아닙니다.");
	}
}
