package programmers.level01;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12954
 *
 * �������� - x��ŭ ������ �ִ� n���� ����
 */
public class No_43 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(new No_43().solution(2, 5)));
	}
	public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        if(n>0) {
        	answer[0] = x;
        }
        
        for(int i=1; i<answer.length; i++) {
        	answer[i] = answer[i-1]+x;
        }
        
        return answer;
    }
	
}
