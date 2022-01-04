package programmers.level01;

import java.util.ArrayList;
import java.util.List;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/17682
 *
 * 2018 KAKAO BLIND RECURUITMENT  - [1차] 다트게임
 */
public class No_46 {
	public static void main(String[] args) {
		System.out.println(new No_46().solution("1D2S#10S"));
	}
	
	public int solution(String dartResult) {
        int answer = 0;
        
        List<Double> list = new ArrayList<>();
        for(String x : dartResult.split("[SDT*#]")) {
        	if(x.length()!=0) {
        		list.add(Double.parseDouble(x));
        	}
        }
        
        int idx = -1;
        boolean prevNum = false;
        for(char x : dartResult.toCharArray()) {
        	if(x>='0' && x<='9') {
        		if(!prevNum) {
        			idx++;
        		}
        		prevNum=true;
        		continue;
        	}else if(x=='D'){
        		list.set(idx, Math.pow(list.get(idx), 2));
        	}else if(x=='T') {
        		list.set(idx, Math.pow(list.get(idx), 3));
        	}else if(x=='*') {
        		list.set(idx, list.get(idx)*2);
        		if(idx!=0) {
        			list.set(idx-1, list.get(idx-1)*2);
        		}
        	}else if(x=='#') {
        		list.set(idx, list.get(idx)*(-1));
        	}
        	prevNum=false;
        }
        
        for(double d : list) {
        	answer += d;
        }
        return answer;
    }
}
