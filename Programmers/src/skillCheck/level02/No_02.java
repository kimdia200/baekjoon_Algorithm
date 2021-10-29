package skillCheck.level02;

import java.util.Arrays;

public class No_02 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(new No_02().solution("110010101001")));
	}
	
	public int[] solution(String s) {
        int[] answer = new int[2];
        while(!s.equals("1")) {
        	answer[0]++;
        	for(char c : s.toCharArray()) {
        		if(c=='0') answer[1]++;
        	}
        	s= Integer.toBinaryString(s.replace("0", "").length());
        }
        return answer;
    }
}
