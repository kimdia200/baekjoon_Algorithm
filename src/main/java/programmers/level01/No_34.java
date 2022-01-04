package programmers.level01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12933
 *
 * 정수 내림차순으로 배치하기
 * 
 * 속도차이 살발하게남 ㄹㅇㄹ
 */

public class No_34 {
	public static void main(String[] args) {
		System.out.println(new No_34().solution2(118372));
	}
	public long solution(long n) {
        int[] arr = new int[10];
        
        while(n>0) {
        	int x = (int)(n%10);
        	arr[x]++;
        	n/=10;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=9; i>=0; i--) {
        	for(int j=0; j<arr[i]; j++) {
        		sb.append(String.valueOf(i));
        	}
        }
        return Long.parseLong(sb.toString());
    }
	public long solution2(long n) {
		
		String s = ""+n;
		
		List<Character> list = new ArrayList<Character>();
		
		for(int i=0; i<s.length(); i++) {
			list.add(s.charAt(i));
		}
		
		list.sort(new Comparator<Character>() {
			public int compare(Character o1, Character o2) {
				return o2.compareTo(o1);
			};
		});
		
		StringBuilder sb = new StringBuilder();
		
		for(char c : list) {
			sb.append(c);
		}
		return Long.parseLong(sb.toString());
	}
}
