package level02;

import java.util.LinkedList;
import java.util.Queue;

public class No_27 {
	public static void main(String[] args) {
		System.out.println(new No_27().solution(8, 1, 3));
	}

	public int solution(int n, int a, int b) {
		int answer = 0;
		Queue<Integer> q = new LinkedList<>();
		for(int i=0; i<n; i++) {
			if(i==(a-1) || i==(b-1)) q.offer(1);
			else q.offer(0);
		}
		outter:
		while(true) {
			answer++;
			int loop = q.size()/2;
			for(int i=0; i<loop; i++) {
				int x = q.poll();
				int y = q.poll();
				if(x==1 && y==1) break outter;
				else if(x==1 || y==1) q.offer(1);
				else q.offer(0);
			}
		}
		return answer;
	}
}
