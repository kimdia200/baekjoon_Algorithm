package level01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class No_05 {
	public static void main(String[] args) {
		No_05 nn = new No_05();
		
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {1,3,5};
		System.out.println(nn.solution(n, lost, reserve));
	}
	
	public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        answer = n - lost.length;
        
        List<Integer> lostList = new ArrayList<Integer>();
        
        for(int x : lost) {
        	lostList.add(x);
        }
        
        List<Integer> reserveList = new ArrayList<Integer>();
        
        for(int x : reserve) {
        	reserveList.add(x);
        }
        
        Iterator<Integer> it = lostList.iterator();
        while(it.hasNext()) {
        	int x = it.next();
        	if(reserveList.contains(x-1)) {
        		int idx = reserveList.indexOf(x-1);
        		answer++;
        		reserveList.remove(idx);
        	}else if(reserveList.contains(x+1)) {
        		int idx = reserveList.indexOf(x+1);
        		answer++;
        		reserveList.remove(idx);
        	}
        }
        
        return answer;
    }
}
