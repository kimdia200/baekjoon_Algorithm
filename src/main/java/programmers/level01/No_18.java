package programmers.level01;

import java.util.Arrays;
/**
 * https://programmers.co.kr/learn/courses/30/lessons/12982
 * 
 * Summer/Winter(~2018) ¿¹»ê
 *
 */
public class No_18 {
	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		int budget = 9;
		
		System.out.println(new No_18().solution(d, budget));
	}
	
	public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        for(int x : d) {
        	if(budget-x<0) break;
        	budget-=x;
        	answer++;
        }
        
        return answer;
    }
}
