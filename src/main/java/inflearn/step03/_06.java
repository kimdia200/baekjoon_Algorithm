package inflearn.step03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//two 포인트 알고리즈
public class _06 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		//선생님이 푼거
		solution(n,k);
	}
	
	//이것도 투포인트 알고리즘을 통해 풀이
	public static void solution(int n, int k) {
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int answer = 0;
		int cnt = 0;
		int lt = 0;
		
		for(int rt=0; rt<n; rt++) {
			if(arr[rt]==0) cnt++;
			while(cnt>k) {
				if(arr[lt]==0) cnt--;
				lt++;
			}
			answer=Math.max(answer, rt-lt+1);
		}
		System.out.println(answer);
	}
	
	public static void solution0(int n, int k) {
		List<Integer> list = new ArrayList<>();
		Integer max = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}
		max = recur(list, max, k);
		System.out.println(max);
	}
	
	public static int recur(List<Integer> list, Integer max, int cnt) {
		if(cnt == 0) {
			StringBuilder sb = new StringBuilder();
			for(int x : list) {
				sb.append(x);
			}
			String[] arr = sb.toString().split("0");
			for(String s : arr) {
				if(max<s.length()) {
					max = s.length();
				}
			}
			return max;
		}
		
		for(int i=0; i<list.size(); i++) {
			int x = list.get(i);
			if(x==1) continue;
			list.set(i, 1);
			max = recur(list, max, cnt-1);
			list.set(i, 0);
		}
		return max;
	}
}
