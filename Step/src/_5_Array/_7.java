package _5_Array;

import java.util.Scanner;

/**
 * URL: https://www.acmicpc.net/problem/4344
 * @author family
 *
 */
public class _7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num=sc.nextInt();
		for (int i = 0; i < num; i++) {
			int[] arr = new int[sc.nextInt()];
			int sum=0;
			for (int j = 0; j < arr.length; j++) {
				arr[j]=sc.nextInt();
				sum+=arr[i];
			}
			double avg = sum/arr.length;
			int count=0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[j]>avg)
					count++;
			}
			System.out.printf("%.3f",(double)(arr.length-count)/arr.length*100);
			System.out.println("%");
		}
	}
}
