package level02;

import java.util.Arrays;

public class No_32_ing {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(new No_32_ing().solution(4, 7, 14)));
	}
	
	public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left+1)];
        int idx = 0;
        int startI = (int)(left/n);
        int startJ = (int)(left%n);
        int endI = (int)(right/n);
        int endJ = (int)(right%n);
        for(int i=startI; i<=endI; i++) {
        	if(i==startI) {
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
