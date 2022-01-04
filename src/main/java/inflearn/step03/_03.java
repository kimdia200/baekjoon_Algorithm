package inflearn.step03;

import java.util.Scanner;

//최대매출
public class _03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max;
		int sum = 0;
		for(int i=0; i<k; i++) {
			sum += arr[i];
		}
		max = sum;
		for(int i=k; i<arr.length; i++) {
			sum-=arr[i-k];
			sum+=arr[i];
			if(max<sum) max = sum;
		}
		System.out.println(max);
	}
}
