package inflearn.step02;

import java.util.Scanner;

//임시반장 정하기
public class _11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[sc.nextInt()][5];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<5; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(new _11().solution(arr));
	}
	
	public int solution(int[][] arr) {
		int num=0;
		int max=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			int cnt = 0;
			for(int j=0; j<arr[i].length; j++) {
				for(int k=0; k<arr.length; k++) {
					if(arr[i][j] == arr[k][j]) cnt++;
				}
			}
			if(max<cnt) {
				max = cnt;
				num = i+1;
			}
		}
		return num;
	}
}
