package inflearn.step04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		
		solution(a,b);
	}
	
	public static void solution(String a, String b) {
		if(a.length() != b.length()) {
			System.out.println("NO");
			return;
		}
		
		Map<Character, Integer> m1 = new HashMap<>();
		for(char c : a.toCharArray()) {
			m1.put(c, m1.getOrDefault(c, 0)+1);
		}
		Map<Character, Integer> m2 = new HashMap<>();
		for(char c : b.toCharArray()) {
			m2.put(c, m2.getOrDefault(c, 0)+1);
		}
		
		if(m1.size() != m2.size()) {
			System.out.println("NO");
			return;
		}
		
		for(char c : m1.keySet()) {
			if(m1.get(c) != m2.get(c)) {
				System.out.println("NO");
				return;
			}
		}
		
		System.out.println("YES");
	}
}
