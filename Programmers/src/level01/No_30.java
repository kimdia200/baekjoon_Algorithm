package level01;

import java.util.HashSet;
import java.util.Set;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12928#
 *
 * 연습문제 - 약수의합
 */
public class No_30 {
	public static void main(String[] args) {
		System.out.println(new No_30().solution(1));
	}
	public int solution(int n) {
		//1일 경우에는 반복문이 돌아가진 않지만
		if(n==1) return 1;
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for(int i=1; i<=n/2; i++) {
        	if(n%i==0) {
        		set.add(i);
        		set.add(n/i);
        	}
        }
        for(int x : set) {
        	answer+=x;
        }
        return answer;
    }
}
