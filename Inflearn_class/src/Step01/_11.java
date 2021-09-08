package Step01;

import java.util.Scanner;

//문자열 압출
public class _11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(new _11().solution(str));
	}
	
	public String solution(String str) {
		StringBuilder sb = new StringBuilder();
		
		int cnt = 1;
		for(int i=0; i<str.length(); i++) {
			if(i==0) sb.append(str.charAt(0));
			else if(i==str.length()-1) {
				if(str.charAt(i-1)==str.charAt(i)) {
					sb.append(++cnt);
				}else {
					sb.append(str.charAt(i));
				}
			}
			else if(str.charAt(i-1) == str.charAt(i)) {
				cnt++;
			}else {
				if(cnt!=1) sb.append(cnt);
				sb.append(str.charAt(i));
				cnt=1;
			}
		}
		return sb.toString();
	}
}
