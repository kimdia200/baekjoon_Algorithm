package _7_String;

import java.util.Arrays;
import java.util.Scanner;

/**
 * URL:https://www.acmicpc.net/problem/10809
 *
 */
public class _3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] in = new int[26];
		String s = sc.next();
		String[] sr = s.split("");
		
		for (int i = 0; i < in.length; i++) {
			in[i]=-1;
		}
		
		for(int i=0; i<s.length(); i++) {
			if(in[(int)sr[i].charAt(0)-97]==-1)
				in[(int)sr[i].charAt(0)-97]=i;
		}
		
		System.out.println(Arrays.toString(in));
	}
}
