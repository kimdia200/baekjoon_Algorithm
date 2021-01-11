package _7_String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * URL : https://www.acmicpc.net/problem/1157
 *
 */
public class _5 {
	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i<26; i++) {
			map.put((char) (65+i), 0);
		}
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toUpperCase().toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				int temp = map.get(arr[i])+1;
				map.put(arr[i], temp);
			}
		}
		
		Set<Character> keyset = map.keySet();
		int max_int=0;
		char max_ch='?';
		//높은숫자 찾기
		for(Character c : keyset) {
			if(map.get(c)>max_int) {
				max_int=map.get(c);
				max_ch=c;
			}
			else if(map.get(c)==max_int) {
				max_ch='?';
			}
		}
		System.out.println(max_ch);
	}
}
