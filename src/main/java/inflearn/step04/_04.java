package inflearn.step04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String t = sc.nextLine();
		
		solution(s,t);
	}

	private static void solution(String s, String t) {
		Map<Character, Integer> bm = new HashMap<>();
		for(char c : t.toCharArray()) {
			bm.put(c, bm.getOrDefault(c, 0)+1);
		}
		
		Map<Character, Integer> am = new HashMap<>();
		for(int i=0; i<t.length()-1; i++) {
			char c = s.charAt(i);
			am.put(c, am.getOrDefault(c, 0)+1);
		}
		
		int lt = 0;
		int cnt = 0;
		char[] arr = s.toCharArray();
		for(int rt = t.length()-1; rt<arr.length; rt++) {
			am.put(arr[rt], am.getOrDefault(arr[rt], 0)+1);
			if(bm.equals(am)) cnt++; 
			am.put(arr[lt], am.get(arr[lt])-1);
			if(am.get(arr[lt])==0) am.remove(arr[lt]);
			lt++;
		}
		System.out.println(cnt);
	}
}
