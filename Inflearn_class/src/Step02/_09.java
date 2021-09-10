package Step02;

import java.util.Scanner;

//격자판 최대합
public class _09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int sum = 0;
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
				sum+=arr[i][j];
			}
			//가로의 합중 최대값구하기
			if(max<sum) max = sum;
			sum=0;
		}
		//세로의 합중 최대값 구하기
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				sum+=arr[j][i];
			}
			if(max<sum) max = sum;
			sum=0;
		}
		
		//대각 case1
		for(int i=0; i<n; i++) {
			sum+=arr[i][i];
		}
		if(max<sum) max = sum;
		sum=0;
		
		//대각 case2
		for(int i=0; i<n; i++) {
			sum+=arr[i][n-i-1];
		}
		if(max<sum) max = sum;
		sum=0;
		System.out.println(max);
	}
}
