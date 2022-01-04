package programmers.level02;

import java.util.PriorityQueue;

// �� �ʰ�
public class No_07_PriorityQueue {
	public static void main(String[] args) {
		int[] scoville = {0,5,2,5,4,3}; 
		int k = 11;
		System.out.println(new No_07_PriorityQueue().solution(scoville, k));
	}

	//PriorityQueue ����
//	PriorityQueue<Integer> queue = new PriorityQueue<>(); //PriorityQueue��          �����մϴ�.
//	queue.offer(data); queue�� �����͸� ���� �ֽ��ϴ�.
//	queue.poll(); //queue�� ���� ���� �����͸� �̽��ϴ�.
//	queue.peek(); //queue�� ���� ���� �����͸� Ȯ���մϴ�.
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
