package Step02;

import java.util.Scanner;

//ºÀ¿ì¸®
public class _10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] arr = new int[n+2][n+2];
		for(int i=1; i<arr.length-1; i++) {
			for(int j=1; j<arr[i].length-1; j++) {
				arr[i][j] = sc.nextInt(); 
			}
		}
		System.out.println(new _10().solution(arr));
	}
	
	public int solution(int[][] arr) {
		int cnt = 0;
		
		for(int i=1; i<arr.length-1; i++) {
			for(int j=1; j<arr.length-1; j++) {
				int top = arr[i-1][j];
				int left = arr[i][j-1];
				int right = arr[i][j+1];
				int bottom = arr[i+1][j];
				int n = arr[i][j];
				if(n>top && n>bottom && n>left && n>right) cnt++;
			}
		}
		return cnt;
	}
}
