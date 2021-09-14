package Step05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//교육과정 설계
public class _07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		System.out.println(new _07().solution(s1,s2));
	}
	public String solution(String s1, String s2) {
		String answer = "YES";
		Queue<Character> q = new LinkedList<Character>();
		for(char c : s1.toCharArray()) q.offer(c);
		for(char c : s2.toCharArray()) {
			if(q.contains(c)) {
				if(c!=q.poll()) return "NO";
			}
		}
		if(!q.isEmpty()) return "NO";
		return answer;
	}
	
	public String solution0(String s1, String s2) {
		String answer = "YES";
		int idx = 0;
		for(char c : s1.toCharArray()) {
			if(idx>s2.indexOf(c)) return "NO";
			idx=s2.indexOf(c);
		}
		return answer;
	}
}
