package inflearn.step06;

import java.util.Scanner;

//※선택정렬
//뒤에중에 가장 작은값을 찾아 앞에 하나씩 둔다
public class _01_Selection_Sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<n-1; i++) {
			int idx = i;
			for(int j=i+1; j<n; j++) {
				if(arr[idx]>arr[j]) {
					idx = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;
		}
		
		for(int x : arr) {
			System.out.print(x+" ");
		}
	}
}
