package inflearn.step06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//마구간정하기
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int c = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		
		System.out.println(solution(arr,n,c));
	}

	private static int solution(int[] arr, int n, int c) {
		int answer=Integer.MAX_VALUE;
		
		List<Integer> list = new ArrayList<Integer>();
		for(int x : arr) list.add(x);
		
		list.sort(null);
		while(list.size()!=c) {
			int idx = 0;
			int min = Integer.MAX_VALUE; 
			for(int i=1; i<list.size()-1; i++) {
				int f = Math.abs(list.get(i-1) - list.get(i));
				int b = Math.abs(list.get(i)-list.get(i+1));
				int x = f<b ? f:b;
				if(min>x) {
					min = x;
					idx = i;
				}
			}
			list.remove(idx);
		}
		
		for(int i=1; i<list.size(); i++) {
			int min = list.get(i)-list.get(i-1);
			if(answer>min) answer=min;
		}
		
		return answer;
	}
}
