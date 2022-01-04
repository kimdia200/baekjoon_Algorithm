package baek_jun._8_Math1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("테스트 횟수 입력하세요 : ");
		int num = sc.nextInt();

		for(int i=0; i<num; i++) {
			System.out.print("층수, 방수, 몇번째 손님 인지 입력하세요 : ");
			int height = sc.nextInt();
			int width= sc.nextInt();
			int customer= sc.nextInt();
			
			if(height*width<customer) {
				System.out.println("객실이 가득 찼습니다.");
				continue;
			}
			
			int floor = customer % height == 0 ? height : customer % height;
			int roomNum = customer % height == 0 ? customer / height : customer / height + 1;

			DecimalFormat df = new DecimalFormat("00");
			String temp = Integer.toString(floor) + df.format(roomNum);
			System.out.println(temp+"호 입니다");
		}
	}
}
