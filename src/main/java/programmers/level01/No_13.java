package programmers.level01;
/**
 * https://programmers.co.kr/learn/courses/30/lessons/76501
 * 
 * 월간 코드챌린지 음양 더하기
 *
 */
public class No_13 {
	public static void main(String[] args) {
		int[] absolutes = {4,7,12};
		boolean[] signs = {true, false, true};
		System.out.println(new No_13().solution(absolutes, signs));
	}
	
	public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i=0; i<absolutes.length; i++) {
        	int x = absolutes[i];
        	if(!signs[i]) {
        		x = x * (-1);
        	}
        	answer += x;
        }
        
        return answer;
    }
}
