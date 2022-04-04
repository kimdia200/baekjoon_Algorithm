package inflearn.step05;

import java.util.*;

//¿¿±ﬁΩ«
public class _08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(new _08().solution(m,arr));
	}
	
	public int solution(int target, int[] arr) {
		int answer=0;

		PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
		List<Integer> list = new ArrayList<>();
		for(int x : arr){
			q.offer(x);
			list.add(x);
		}

		while(target>=0){
			Integer now = list.remove(0);
			if(now!=q.peek()){
				list.add(now);
				if(target==0) target=list.size();
			}else{
				q.poll();
				answer++;
			}
			target--;
		}
		return answer;
	}
}
