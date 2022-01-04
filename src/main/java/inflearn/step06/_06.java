package inflearn.step06;

import java.util.Arrays;
import java.util.Scanner;

//장난꾸러기
public class _06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		solution(arr);
	}

	private static void solution(int[] arr) {
		int[] answer = new int[2];
		int idx = 0;
		
		int[] clone = arr.clone();
		Arrays.sort(clone);
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=clone[i]) {
				answer[idx++] = i+1;
			}
		}
		
		System.out.println(answer[0]+" "+answer[1]);
	}
	
}
