package level02;

import java.util.LinkedList;
import java.util.Queue;

//다리를 지나는 트럭 (loop돌리는 방식을 조금 다르게하여 반복 횟수을 줄임)
public class No_18 {
	public static void main(String[] args) {
		int n=100;
		int w=100;
		int[] arr = {10,10,10,10,10,10,10,10,10,10};
		System.out.println(new No_18().solution(n, w, arr));
	}
	public int solution(int len, int w, int[] weights) {
        int time = 0;
        
        Queue<Truck> q = new LinkedList<>();
        
        int now=0;
        int i=0;
        int cnt=0;
        while(cnt<weights.length) {
        	//올라가도 되나요
        	if(i<weights.length && now+weights[i]<=w) {
        		now+=weights[i];
        		//도착예정시간 기록
        		q.offer(new Truck(weights[i++],len+time));
        		time++;
        	}else { //안올라가면 시간단축을 위해 중간생략
        		time=q.peek().getTime();
        	}
        	if(q.peek().getTime()==time){ //도착시간이 된녀석은 뺄게요
        		now-=q.peek().getWeight();
        		cnt++;
        		q.poll();
        	}
        }
        return time+1;
    }
	class Truck{
		int weight;
		int time;
		public int getWeight() {
			return weight;
		}
		public int getTime() {
			return time;
		}
		public Truck(int weight, int time) {
			this.weight = weight;
			this.time = time;
		}
	}
}
