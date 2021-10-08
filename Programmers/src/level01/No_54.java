package level01;

import java.util.Arrays;

public class No_54 {
	public static void main(String[] args) {
		int[] weights = {60,70,60};
		String[] head2head = {"NNN","NNN","NNN"};
		System.out.println(Arrays.toString(new No_54().solution(weights,head2head)));
	}

	//승률
	//체급높은애 이긴횟수
	//몸무게높은순
	//번호작은순
	public int[] solution(int[] weights, String[] head2head) {
		int[] answer=new int[weights.length];
		
		Boxer[] arr = new Boxer[weights.length];
		
		for(int i=0; i<weights.length;i++) {
			int weight = weights[i];
			int number = i+1;
			int winToOverWeight = 0;
			double win = 0;
			double round = 0;
			double winRate = 0;
			
			for(int j=0; j<head2head[i].length(); j++) {
				if(i==j) continue;
				
				char c = head2head[i].charAt(j);
				if(c=='L') round++;
				else if(c=='W') {
					win++;
					round++;
					if(weight<weights[j]) winToOverWeight++;
				}
			}
			if((round)>0)
				winRate = win/round;
			arr[i] = new Boxer(winRate, winToOverWeight, weight, number);
		}
		
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			answer[i] = arr[i].getNumber();
		}
		return answer;
	}
}

class Boxer implements Comparable<Boxer>{
	private double winRate;
	private int winToOverWeight;
	private int weight;
	private int number;

	public Boxer(double winRate, int winToOverWeight, int weight, int number) {
		this.winRate = winRate;
		this.winToOverWeight = winToOverWeight;
		this.weight = weight;
		this.number = number;
	}

	public int getNumber() {
		return this.number;
	}
	@Override
	public int compareTo(Boxer o) {
		if(this.winRate!=o.winRate) {
			double temp = o.winRate-this.winRate;
			if(temp<0) return -1;
			else if(temp>0) return 1;
			else return 0;
		}else if(this.winToOverWeight != o.winToOverWeight) {
			return o.winToOverWeight-this.winToOverWeight;
		}else if(this.weight!=o.weight) {
			return o.weight-this.weight;
		}else {
			return this.number-o.number;
		}
	}
}
