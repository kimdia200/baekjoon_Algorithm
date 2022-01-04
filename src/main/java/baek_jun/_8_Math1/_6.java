package baek_jun._8_Math1;

import java.util.Scanner;

public class _6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("층과 호수를 입력해주세요");
		int floor = sc.nextInt();
		int room = sc.nextInt();
		int[][] arr = new int[floor+1][room];
		for(int i=0; i<arr.length; i++) {
			arr[i][0] = 1;
		}
		for(int i=0; i<room; i++) {
			arr[0][i]=i+1;
		}
		
		for(int i=1; i<arr.length; i++) {
			for(int j=1; j<arr[i].length; j++) {
				arr[i][j] = arr[i][j-1]+arr[i-1][j];
			}
		}
		
		System.out.println(floor+"층 "+room+"호 : "+arr[floor][room-1]+"명 거주중");
		
	}
}
//
//1    4     10    20     35   
//
//1    3     6     10     15
//
//1    2     3     4      5