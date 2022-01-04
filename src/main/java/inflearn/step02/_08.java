package inflearn.step02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//등수 구하기
public class _08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		new _08().solution1(arr);
	}
	
	public void solution1(int[] arr) {
		List<Integer> list = new ArrayList<>();
		for(int x : arr) {
			list.add(x);
		}
		Collections.reverse(list);
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<list.size(); i++) {
			if(!map.containsKey(list.get(i))) {
				map.put(list.get(i), i+1);
			}
		}
		
		for(int x : arr) {
			System.out.print(map.get(x)+" ");
		}
	}
	
	public void solution2(int[] arr) {
		int[] answer = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			int rank = 1;
			for(int j=0; j<arr.length; j++) {
				if(arr[i] < arr[j]) rank++;
			}
			answer[i] = rank;
		}
		System.out.println(Arrays.toString(answer));
	}
}
