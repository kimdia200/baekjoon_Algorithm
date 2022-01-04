package inflearn.step01;

import java.util.Scanner;

//유효한 팰린드롬
public class _08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		new _08().solution(str);
	}
	
	public void solution(String str) {
		String reverse;
		StringBuilder sb = new StringBuilder();
		for(char c : str.toCharArray()) {
			if(Character.isAlphabetic(c))
				sb.append(c);
		}
		str = sb.toString();
		reverse = sb.reverse().toString();
		
		if(str.equalsIgnoreCase(reverse))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
