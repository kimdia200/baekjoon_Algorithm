package baek_jun._9_Math2;

import java.util.Scanner;

/**
 * URL : https://www.acmicpc.net/problem/1978
 * @author eksoo
 *
 */
public class _1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[sc.nextInt()];
	
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int count =0;
		for (int i = 0; i < arr.length; i++) {
			boolean notFound = true;
			for (int j = 2; j < arr[i]; j++) {
				if(arr[i]%j == 0) {
					notFound=false;
					break;
				}
			}
			if(arr[i]==1)
				notFound=false;
			if(notFound || arr[i]==2) {
				count++;
			}
		}
		System.out.println(count);
	}
}
