package baek_jun._5_Array;

import java.util.Scanner;

/**
 * URL: https://www.acmicpc.net/problem/10818
 * 
 */
public class _1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		int min=arr[0];
		int max=arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		
		System.out.println("min = "+min+", max = "+max);
	}
}
