package level02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//  스택/큐 -> 기능개발
public class No_06 {
	public static void main(String[] args) {
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1,1,1,1,1,1};
		
		System.out.println(Arrays.toString(new No_06().solution(progresses, speeds)));
	}
	
	public int[] solution(int[] progresses, int[] speeds) {
        
        List<Integer> list = new ArrayList<>();

        int cmpt = 0;
        
        while(cmpt!=progresses.length) {
        	for(int i=cmpt; i<progresses.length; i++) {
        		progresses[i] += speeds[i];
        	}
        	
        	if(progresses[cmpt]>=100) {
        		int cnt = 1;
        		for(int i=cmpt+1; i<progresses.length;i++) {
        			if(progresses[i]>=100) {
        				cnt++;
        			}else break;
        		}
        		list.add(cnt);
        		cmpt+=cnt;
        	}
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}
