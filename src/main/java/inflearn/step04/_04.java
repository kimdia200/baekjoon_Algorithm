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
		int answer = 0;
		int len = t.length();
		Map<Character,Integer> tm = new HashMap<>();
		for(char c : t.toCharArray()){
			tm.put(c,tm.getOrDefault(c,0)+1);
		}

		Map<Character,Integer> sm = new HashMap<>();
		char[] arr = s.toCharArray();
		for(int i=0; i<len-1; i++){
			sm.put(arr[i],sm.getOrDefault(arr[i],0)+1);
		}
		int lt=0;
		for(int rt=len-1; rt<arr.length; rt++){
			sm.put(arr[rt],sm.getOrDefault(arr[rt],0)+1);
			answer += equals(sm,tm);
			sm.put(arr[lt],sm.get(arr[lt])-1);
			if(sm.get(arr[lt])==0) sm.remove(arr[lt]);
			lt++;
		}
		System.out.println(answer);
	}

	private static int equals(Map<Character,Integer> m1, Map<Character,Integer> m2){
		if(m1.size() != m2.size()) return 0;
		for(char key : m1.keySet()){
			if(m1.get(key)!=m2.get(key)) return 0;
		}
		return 1;
	}


	private static void solution2(String s, String t) {
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
