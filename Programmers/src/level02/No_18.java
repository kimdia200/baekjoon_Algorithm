package level02;

import java.util.LinkedList;
import java.util.Queue;

//�ٸ��� ������ Ʈ�� (loop������ ����� ���� �ٸ����Ͽ� �ݺ� Ƚ���� ����)
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
        	//�ö󰡵� �ǳ���
        	if(i<weights.length && now+weights[i]<=w) {
        		now+=weights[i];
        		//���������ð� ���
        		q.offer(new Truck(weights[i++],len+time));
        		time++;
        	}else { //�ȿö󰡸� �ð������� ���� �߰�����
        		time=q.peek().getTime();
        	}
        	if(q.peek().getTime()==time){ //�����ð��� �ȳ༮�� ���Կ�
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
