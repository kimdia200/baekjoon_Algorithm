package level02;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
//«¡∏∞≈Õ
public class No_11 {
	public static void main(String[] args) {
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;
		System.out.println(new No_11().solution(priorities, location));
	}
	
	
	public int solution(int[] priorities, int target) {
		int answer = 0;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
        for(int x : priorities) {
        	q1.offer(x);
        	q2.offer(x);
        }
        while(q1.size()!=0) {
        	if(q1.peek()==q2.peek()) {
        		q1.poll();
        		q2.poll();
        		answer++;
        		if(target==0) break;
        		else target--;
        	}else {
        		q1.offer(q1.poll());
        		if(target==0) target = q1.size()-1;
        		else target--;
        	}
        }
        return answer;
    }
}
