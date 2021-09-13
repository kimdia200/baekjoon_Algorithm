package Step03;

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
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			for(int j=i; j<arr.length; j++) {
				sum+=arr[j];
				if(sum==m) {
					cnt++;
					break;
				}else if(sum>m) {
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}
