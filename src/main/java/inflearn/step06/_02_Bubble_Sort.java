package inflearn.step06;

import java.util.Scanner;

//※ 버블정렬 
//가장 큰수를 하나씩 뒤로 보내는 방법
public class _02_Bubble_Sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		for(int x : arr) {
			System.out.print(x + " ");
		}
	}
}
