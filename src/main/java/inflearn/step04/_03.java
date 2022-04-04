package inflearn.step04;

import java.util.*;

//매출액의 종류
//Hash + sliding window
public class _03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		solution0(n, k, arr);
	}
	public static void solution0(int n, int k, int[] arr) {
		List<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<k-1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		int lt = 0;
		for(int rt=k-1; rt<arr.length; rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
			answer.add(map.size());
			map.put(arr[lt], map.get(arr[lt])-1);
			if(map.get(arr[lt])==0) {
				map.remove(arr[lt]);
			}
			lt++;
		}
		for(int x : answer) {
			System.out.print(x+" ");
		}
	}
	
	//시간초과 나왔음...
	public static void solution(int n, int k, int[] arr) {
		List<Integer> list = new ArrayList<>();
		Map<Integer,Integer> map = new HashMap<>();

		for(int i=0; i<k-1;k++){
			map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		}

		int lt=0;
		for(int rt=k-1; rt<arr.length; rt++){
			map.put(arr[rt],map.getOrDefault(arr[rt],0)+1);
			list.add(map.size());
			map.put(arr[lt],map.get(arr[lt])-1);
			if(map.get(arr[lt])==0){
				map.remove(arr[lt++]);
			}
		}
		for(int x : list){
			System.out.println(x + " ");
		}
	}
}
