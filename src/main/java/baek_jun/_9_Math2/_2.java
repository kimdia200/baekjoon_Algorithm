package baek_jun._9_Math2;

import java.util.Scanner;

/**
 * URL : https://www.acmicpc.net/problem/2581
 * 
 * @author eksoo
 *
 */
public class _2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numa = sc.nextInt();
		int numb = sc.nextInt();
		int[] arr = new int[numb - numa + 1];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = numa + i;
		}

		int min = Integer.MAX_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean notFound = true;
			for (int j = 2; j < arr[i]; j++) {
				if (arr[i] % j == 0) {
					notFound = false;
					break;
				}
			}
			if (arr[i] == 1)
				notFound = false;
			if (notFound || arr[i] == 2) {
				if (min > arr[i])
					min = arr[i];
				sum += arr[i];
			}
		}
		if (sum != 0) {
			System.out.println(sum);
			System.out.println(min);
		} else
			System.out.println(-1);

	}
}
