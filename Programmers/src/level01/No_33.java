package level01;

import java.util.ArrayList;
import java.util.List;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12932
 * 
 * 연습문제 - 자연수 뒤집어 배열로 만들기
 * 
 * 두개 모두 속도가 차이가 크게 안나는듯????
 *
 */
public class No_33 {
	public static void main(String[] args) {
		System.out.println(new No_33().solution2(12345));
	}
	public int[] solution(long n) {
        int[] answer;
        List<Integer> list = new ArrayList<>();
        while(n>0) {
        	list.add((int)(n%10));
        	n /= 10;
        }
        answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }
	
	public int[] solution2(long n) {
		int len = String.valueOf(n).length();
		int[] answer = new int[len];
		int cnt = 0;
		
		while(n>0) {
			answer[cnt++] = (int)(n%10);
			n/=10;
		}
		return answer;
	}
}
