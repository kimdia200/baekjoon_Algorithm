package programmers.level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42889
 * 
 * 2019 KAKAO BLIND RECRUITMENT - ½ÇÆÐÀ²
 *
 */
public class No_19 {
	public static void main(String[] args) {
		int n = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		System.out.println(Arrays.toString(new No_19().solution(n, stages)));
	}
	
	public int[] solution(int n, int[] stages) {
        int[] answer = new int[n];
        
        List<Stage> list = new ArrayList<>();
        for(int i=1; i<=n; i++) {
        	list.add(new Stage(i));
        }
        for(int x : stages) {
        	for(int i=1; i<=n; i++) {
        		if(x>i) {
        			list.get(i-1).clear();
        		}else if(x==i) {
        			list.get(i-1).failure();
        		}
        	}
        }
        list.sort(null);
        
        for(int i=0; i<list.size(); i++) {
        	answer[i] = list.get(i).getStage();
        }
        
        return answer;
    }
	
	class Stage implements Comparable<Stage>{
		private int stage;
		private int clear_Cnt;
		private int failure;
		
		public Stage(int stage) {
			this.stage = stage;
		}
		
		public void clear(){
			this.clear_Cnt++;
		}
		public void failure() {
			this.failure++;
		}
		public double getFailurePercent() {
			if(this.clear_Cnt + this.failure == 0) {
				return 0;
			}else if(this.clear_Cnt==0) {
				return 1;
			}else if(this.failure==0) {
				return 0;
			}
			return (double)this.failure/(this.clear_Cnt + this.failure);
		}
		public int getStage() {
			return this.stage;
		}

		@Override
		public int compareTo(Stage o) {
			double d = this.getFailurePercent() - o.getFailurePercent();
    		if(d>0) return -1;
    		if(d<0) return 1;
    		return 0;
		}
	}
}
