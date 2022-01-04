package inflearn.step01;

import java.util.Scanner;

//숫자만 추출
public class _09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		new _09().solution2(sc.nextLine());
	}
	public void solution(String str) {
		StringBuilder sb = new StringBuilder();
		
		for(char c : str.toCharArray()) {
			if(c>='0' && c<='9') sb.append(c);
		}
		System.out.println(Integer.parseInt(sb.toString()));
	}
	public void solution2(String str) {
		System.out.println(Integer.parseInt(str.replaceAll("[^0-9]", "")));
	}
}
