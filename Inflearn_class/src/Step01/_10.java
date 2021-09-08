package Step01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//가장짧은 문자 거리
public class _10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		solution2(str1, str2);
	}
	public static void solution(String s1, String s2) {
		int[] result = new int[s1.length()];
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i) == s2.charAt(0))
				list.add(i);
			result[i] = Integer.MAX_VALUE;
		}
		
		for(int i=0; i<s1.length(); i++) {
			for(int x : list) {
				int len = Math.abs(i-x);
				if(result[i]>len)
					result[i] = len;
			}
		}
		
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]);
			if(i!=result.length-1) System.out.print(" ");
		}
	}
	
	public static void solution2(String s1, String s2) {
		int[] result = new int[s1.length()];
		for(int i=0; i<result.length; i++) {
			result[i] = Integer.MAX_VALUE;
		}
		
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)==s2.charAt(0)) {
				for(int j=0; j<s1.length(); j++) {
					int len = Math.abs(i-j);
					if(result[j]>len) result[j] = len;
				}
			}
		}
		
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]);
			if(i!=result.length-1) System.out.print(" ");
		}
	}
}
