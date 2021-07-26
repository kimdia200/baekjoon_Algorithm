package level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12917
 *
 * �������� - ���ڿ� ������������ ��ġ�ϱ�
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
	 * �ٸ������ �亯
	 * 
	 * �÷����� ���� �ʰ� �⺻ Arrays������ ����Ͽ� ������
	 * reverse�� StringBuilder�� ��� �̿�
	 * 
	 * �� �亯���� �ξ� ����ѵ�
	 */
	public String solution2(String s) {
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		return new StringBuilder(new String(arr)).reverse().toString();
	}
}
