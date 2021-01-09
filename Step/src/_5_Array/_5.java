package _5_Array;

import java.util.Scanner;

/**
 * URL:https://www.acmicpc.net/problem/1546
 *
 */
public class _5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] arr = new double[sc.nextInt()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		double max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(max<arr[i])
				max = arr[i];
		}
		double sum=0;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=arr[i]/max*100;
			sum+=arr[i];
		}
		double avg = sum/arr.length;
		System.out.println(avg);
	}
}
