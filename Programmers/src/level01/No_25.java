package level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12917
 *
 * 연습문제 - 문자열 내림차순으로 배치하기
 */
public class No_25 {
	public static void main(String[] args) {
		System.out.println(new No_25().solution2("zzddZdF"));
	}
	public String solution(String s) {
		
		List<Character> list = new ArrayList<>();
		for(int i=0; i<s.length(); i++) {
			list.add(s.charAt(i));
		}
		
		list.sort(null);
		Collections.reverse(list);
		
		StringBuilder sb = new StringBuilder();
		
		for(char c : list) {
			sb.append(c);
		}
		return sb.toString();
	}
	
	/**
	 * 다른사람의 답변
	 * 
	 * 컬렉션을 쓰지 않고 기본 Arrays정렬을 사용하여 구현함
	 * reverse는 StringBuilder의 기능 이용
	 * 
	 * 내 답변보다 훨씬 깔끔한듯
	 */
	public String solution2(String s) {
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		return new StringBuilder(new String(arr)).reverse().toString();
	}
}
