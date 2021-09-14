package Step06;

import java.util.Scanner;

//¡Ø»ğÀÔÁ¤·Ä
public class _03_Insertion_sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		solution(arr);
		
		for(int x : arr) {
			System.out.print(x + " ");
		}
	}
	
	public static void solution(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			int temp = arr[i], j;
			for(j=i-1; j>=0 && arr[j]>temp; j--) {
				if(arr[j]>temp) arr[j+1]=arr[j];
			}
			arr[j+1]=temp;
		}
	}
}
