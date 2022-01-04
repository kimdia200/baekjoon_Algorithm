package inflearn.step01;

import java.util.Scanner;

public class _01 {
	
	public int solution(String word, String ch) {
		
		String[] arr = word.split("");
		int cnt = 0;
		
		for(String s : arr) {
			if(s.equalsIgnoreCase(ch)) {
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String ch = sc.nextLine().substring(0,1);
		
		_01 m = new _01();
		System.out.println(m.solution(word,ch));
	}
}
