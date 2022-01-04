package programmers.skillCheck.level01;

import java.util.Arrays;

public class No_01 {
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(new No_01().solution(-4, 2)));
	}
	
	public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i=0; i<n; i++) {
        	answer[i] = (long)x*(i+1);
        }
        return answer;
    }
}	
