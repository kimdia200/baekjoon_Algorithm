
package inflearn.step06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		solution(s,n,arr);
	}
	
	public static void solution(int s, int n, int[] arr) {
		List<Integer> list = new ArrayList<>();
		for(int i : arr) {
			if(list.size()<s && !list.contains(i)) list.add(i);
			else if(list.contains(i)) 
					list.add(list.remove(list.indexOf(new Integer(i))));
			else {
					list.remove(0);
					list.add(i);
			}
		}
		Collections.reverse(list);
		for(int x : list) {
			System.out.print(x + " ");
		}
	}
}
