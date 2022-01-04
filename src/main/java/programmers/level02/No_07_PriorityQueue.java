package programmers.level02;

import java.util.PriorityQueue;

// 더 맵게
public class No_07_PriorityQueue {
	public static void main(String[] args) {
		int[] scoville = {0,5,2,5,4,3}; 
		int k = 11;
		System.out.println(new No_07_PriorityQueue().solution(scoville, k));
	}

	//PriorityQueue 사용법
//	PriorityQueue<Integer> queue = new PriorityQueue<>(); //PriorityQueue를          생성합니다.
//	queue.offer(data); queue에 데이터를 집어 넣습니다.
//	queue.poll(); //queue에 가장 작은 데이터를 뽑습니다.
//	queue.peek(); //queue의 가장 작은 데이터를 확인합니다.
	public int solution(int[] scoville, int k) {
		int answer = 0;

		   PriorityQueue<Integer> heap = new PriorityQueue<>();
		   for(int i=0; i<scoville.length; i++){
		       heap.offer(scoville[i]);
		   }
		   
		   while(heap.peek() < k){
		       if(heap.size() < 2) return -1;
		       int f1 = heap.poll();
		       int f2 = heap.poll();
		       int newFood = f1 + (f2 * 2);
		       heap.offer(newFood);
		       answer++;
		   }

		   return answer;
	}
}
