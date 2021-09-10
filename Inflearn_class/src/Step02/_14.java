package Step02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//공통원소구하기
public class _14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for(int i=0; i<n; i++) {
			arr1[i] = sc.nextInt();
		}
		Arrays.sort(arr1);
		int m = sc.nextInt();
		int[] arr2 = new int[m];
		for(int i=0; i<m; i++) {
			arr2[i] = sc.nextInt();
		}
		Arrays.sort(arr2);
		
		List<Integer> list = new ArrayList<>();
//		int cnt = 0;
//		for(int i=0; i<arr1.length; i++) {
//			for(int j=0; j<arr2.length; j++) {
//				if(arr1[i] == arr2[j]) {
//					list.add(arr1[i]);
//				}
//				cnt++;
//			}
//		}
		
		//※ 탐색방법 신박한듯
		int cnt =0;
		int c1=0,c2=0;
		while(c1<n && c2<m) {
			if(arr1[c1] == arr2[c2]) {
				list.add(arr1[c1++]);
				c2++;
			}else if(arr1[c1]<arr2[c2]) {
				c1++;
			}else {
				c2++;
			}
			cnt++;
		}
		
		System.out.println(cnt);
	}
}
