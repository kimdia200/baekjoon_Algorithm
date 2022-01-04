package inflearn.step01;

import java.util.Scanner;

//¾ÏÈ£
public class _12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		String str = sc.next();
		
		new _12().solution(cnt, str);
	}
	
	public void solution(int cnt, String str) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<cnt; i++) {
			String s = str.substring(0,7);
			str = str.substring(7);
			
			s=s.replaceAll("[#]", "1");
			s=s.replaceAll("[*]", "0");
			sb.append((char)Integer.parseInt(s,2));
		}
		System.out.println(sb.toString());
	}
}
