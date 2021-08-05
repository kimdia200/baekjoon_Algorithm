package level01;

import java.util.HashSet;
import java.util.Set;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/77884
 * 
 * ¿ù°£ ÄÚµåÃ§¸°Áö ½ÃÁğ2 - ¾à¼öÀÇ °¹¼öÀÇ µ¡¼À
 *
 */
public class No_51 {
	public static void main(String[] args) {
		System.out.println(new No_51().solution(24, 27));
	}
	public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++) {
        	Set<Integer> set = new HashSet<>();
        	for(int j=1; j<=i; j++) {
        		if(i%j == 0) {
        			set.add(j);
        		}
        	}
        	if(set.size()%2==0) answer+=i;
        	else answer-=i;
        }
        return answer;
    }
}
