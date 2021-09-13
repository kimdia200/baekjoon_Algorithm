package Step03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//두 배열 합치기
public class _01 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] arr1 = new int[n];
//		for(int i=0; i<arr1.length; i++) {
//			arr1[i] = sc.nextInt();
//		}
//		int m = sc.nextInt();
//		int[] arr2 = new int[m];
//		for(int i=0; i<arr2.length; i++) {
//			arr2[i] = sc.nextInt();
//		}
//		
//		int[] result = new int[n+m];
//		for(int i=0; i<result.length; i++) {
//			if(i<n) {
//				result[i] = arr1[i];
//			}else {
//				result[i] = arr2[i-n];
//			}
//		}
//		
//		Arrays.sort(result);
//		for(int x : result) {
//			System.out.print(x+" ");
//		}
//	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}
		int m = sc.nextInt();
		for(int i=0; i<m; i++) {
			list.add(sc.nextInt());
		}
		list.sort(null);
		for(int x : list) {
			System.out.print(x + " ");
		}
	}
	
}
