package programmers.level02;

import java.util.Arrays;

//월간 코드챌린지 시즌3 - n^2배열 자르기
//https://programmers.co.kr/learn/courses/30/lessons/87390#
public class No_32 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(new No_32().solution(3, 2, 5)));
	}
	
	public int[] solution(int n, long left, long right) {
		int[] answer = new int[(int)(right - left + 1)];
		int idx = 0;
		for (long i = left; i <= right; i++) {
			answer[idx++] = (int) Math.max(i/n+1, i%n+1);
		}
		return answer;
	}
	
	//기존에 풀었던방식  해당부분에 해당하는 값을 구하는데 좀 난잡하게 구했따
	public int[] solution2(int n, long left, long right) {
        int[] answer = new int[(int)(right-left+1)];
        int idx = 0;
        int startI = (int)(left/n);
        int startJ = (int)(left%n);
        int endI = (int)(right/n);
        int endJ = (int)(right%n);
        for(int i=startI; i<=endI; i++) {
        	if(startI==endI) {
        		for(int j=startJ; j<=endJ; j++) {
        			if(i<=j) answer[idx++]=j+1;
            		else answer[idx++]=i+1;
        		}
        	}else if(i==startI) {
        		for(int j=startJ; j<n; j++) {
        			if(i<=j) answer[idx++]=j+1;
            		else answer[idx++]=i+1;
        		}
        	}else if(i==endI) {
        		for(int j=0; j<=endJ; j++) {
        			if(i<=j) answer[idx++]=j+1;
            		else answer[idx++]=i+1;
        		}
        	}else {
        		for(int j=0; j<n; j++) {
        			if(i<=j) answer[idx++]=j+1;
            		else answer[idx++]=i+1;
            	}
        	}
        }
        return answer;
    }
}
