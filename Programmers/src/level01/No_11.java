package level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42840
 * 
 * 모의 고사
 * 
 */

public class No_11 {
	public static void main(String[] args) {
		No_11 n = new No_11();
		int[] arr = {1,2,3,4,5,2};
		System.out.println(Arrays.toString(n.solution(arr)));
	}
	public int[] solution(int[] answers) {
        int[] s1 = {1,2,3,4,5};
        int[] s2 = {2,1,2,3,2,4,2,5};
        int[] s3 = {3,3,1,1,2,2,4,4,5,5};
        
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        
        for(int i=0; i<answers.length; i++) {
        	int idx = i;
        	if(idx>=s1.length) {
        		idx = idx % s1.length;
        	}
        	if(s1[idx]==answers[i]) {
        		cnt1++;
        	}
        	idx = i;
        	if(idx>=s2.length) {
        		idx = idx % s2.length;
        	}
        	if(s2[idx]==answers[i]) {
        		cnt2++;
        	}
        	
        	idx = i;
        	if(idx>=s3.length) {
        		idx = idx % s3.length;
        	}
        	if(s3[idx]==answers[i]) {
        		cnt3++;
        	}
        }
        
        int max = cnt1;
        if(cnt2>max) {
        	max = cnt2;
        }
        if(cnt3>max) {
        	max = cnt3;
        }
        
        List<Integer> list = new ArrayList<Integer>();
        if(cnt1 == max) {
        	list.add(1);
        }
        if(cnt2 == max) {
        	list.add(2);
        }
        if(cnt3 == max) {
        	list.add(3);
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}
