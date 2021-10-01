package Step06;

import java.util.Arrays;
import java.util.Scanner;

//ÀÌÁø Å½»ö Binary Search
public class _08_Binary_Search {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(solution(arr, m));
	}

	private static int solution(int[] arr, int m) {
		Arrays.sort(arr);
		int answer = -1;
		int lt = 0;
		int rt = arr.length-1;
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			
			if(arr[mid] == m) {
				answer = mid+1;
				break;
			}
			else if(arr[mid] > m) rt = mid-1;
			else if(arr[mid] < m) lt = mid+1;
		}
		return answer;
	}
}
