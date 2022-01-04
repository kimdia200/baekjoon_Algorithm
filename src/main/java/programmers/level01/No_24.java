package programmers.level01;

import java.util.ArrayList;
import java.util.List;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12910
 * 
 * 연습문제 - 나누어떨어지는 숫자 배열
 *
 */
public class No_24 {
	public static void main(String[] args) {
		int[] arr = {5,9,7,10};
		System.out.println(new No_24().solution(arr, 5));
	}
	
	public int[] solution(int[] arr, int divisor) {
        int[] answer = {-1};
        List<Integer> list = new ArrayList<>();
        for(int x : arr) {
        	if(x%divisor ==0) list.add(x);
        }
        if(list.size()!=0) {
        	answer = new int[list.size()];
        	list.sort(null);
        	for(int i=0; i<answer.length; i++) {
        		answer[i] = list.get(i);
        	}
        }
        return answer;
    }
}
