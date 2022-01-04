package inflearn.step01;

import java.util.Scanner;

//회문 문자열
public class _07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		new _07().solution(str);
	}
	public void solution(String str) {
		String reverse = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(reverse)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
