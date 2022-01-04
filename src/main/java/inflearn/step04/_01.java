package inflearn.step04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String result = sc.next();
		
		System.out.println(new _01().soluton(n, result));
		
	}
	public char soluton(int n, String result) {
		
		Map<Character, Integer> map = new HashMap<>();
		for(char x : result.toCharArray()) {
//			if(map.containsKey(x)) {
//				map.put(x, map.get(x)+1);
//			}else {
//				map.put(x, 1);
//			}
			//getOrDefault로 간단하게 할수있음
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		
		char answer=' ';
		int max = Integer.MIN_VALUE;
		
		for(char key : map.keySet()) {
			int val = map.get(key);
			if(max<val) {
				max = val;
				answer=key;
			}
		}
		return answer;
	}
}
