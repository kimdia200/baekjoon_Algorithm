package inflearn.step03;

import java.util.Scanner;

//연속 부분수열
public class _04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int cnt = 0;
		int sum = 0;
		int lt=0;
		for(int rt=0; rt<arr.length; rt++){
			sum+=arr[rt];
			if(sum==m){
				cnt++;
			}
			while(sum>=m){
				sum-=arr[lt++];
				if(sum==m) cnt++;
			}
		}
		System.out.println(cnt);
	}
}
