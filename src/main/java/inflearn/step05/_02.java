package inflearn.step05;

import java.util.Scanner;

//괄호문자제거
public class _02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		System.out.println(new _02().solution(str));
	}

	private String solution(String str) {
		StringBuilder sb = new StringBuilder();
		
		int check = 0;
		for(char c : str.toCharArray()) {
			if(c=='(') check++;
			else if(c==')') check--;
			else if(check==0) sb.append(c);
		}
		return sb.toString();
	}
}
