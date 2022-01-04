package inflearn.step06;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//중복확인
public class _05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(solution(n,arr));
	}
	
	public static String solution(int n, int[] arr) {
		String answer = "D";
		
		Set<Integer> set = new HashSet<>();
		for(int x : arr) {
			set.add(x);
		}
		if(arr.length == set.size()) {
			answer = "U";
		}
		return answer;
	}
}
