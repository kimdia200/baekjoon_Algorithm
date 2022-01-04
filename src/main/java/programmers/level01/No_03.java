package programmers.level01;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * https://programmers.co.kr/learn/courses/30/lessons/1845?language=java
 * ÆùÄÏ¸ó
 *
 */
public class No_03 {
	public static void main(String[] args) {
		
	}
	
	public int solution(int[] nums) {
        int answer = 0;
        int max = nums.length/2;
        
        Set<Integer> set = new HashSet<>(); 
        
        for(int x : nums) {
        	set.add(x);
        }
        
        if(set.size()>max) {
        	answer = max;
        }else {
        	answer = set.size();
        }
        
        return answer;
    }
}
