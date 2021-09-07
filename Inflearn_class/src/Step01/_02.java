package Step01;

import java.util.Scanner;

public class _02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(new _02().solution(str));
	}
	public String solution(String str) {
		char[] arr = str.toCharArray();
		StringBuilder sb = new StringBuilder();
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]<'a') arr[i]+=32;
//			else arr[i]-=32;
//			sb.append(arr[i]);
//		}
		
		//대문자인지 소문자인지 판단해주는 char 메서드가 있었음
		for(char c : arr) {
			if(Character.isLowerCase(c)) {
				sb.append(Character.toUpperCase(c));
			}else {
				sb.append(Character.toLowerCase(c));
			}
		}
		return sb.toString();
	}
}
