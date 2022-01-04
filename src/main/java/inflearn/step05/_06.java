package inflearn.step05;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

//공주구하기
public class _06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.println(new _06().solution(n,k));
	}
	private int solution(int n, int k) {
		int answer = 0;
		Queue<Integer> q = new LinkedList<>();
		for(int i=1; i<=n; i++) {
			q.offer(i);
		}
		
		while(!q.isEmpty()) {
			for(int i=1; i<k; i++) {
				q.offer(q.poll());
			}
			q.poll();
			if(q.size()==1) answer=q.poll();
		}
		return answer;
	}

	private int solution0(int n, int k) {
		List<Integer> list = new LinkedList<>();
		for(int i=1; i<=n; i++) {
			list.add(i);
		}
		for(int i=k-1; list.size()>1; i+=(k-1)) {
			if(i>=list.size()) i%=list.size();
			list.remove(i);
		}
		return list.get(0);
	}
}
