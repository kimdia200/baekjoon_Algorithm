package programmers.level01;

public class No_55 {
	public static void main(String[] args) {
		int[][] arr = {{100,90,98,88,65},{50,45,99,85,77},{47,88,95,80,67},{61,57,100,80,65},{24,90,94,75,65}};
		System.out.println(new No_55().solution(arr));
	}
	public String solution(int[][] scores) {
		StringBuilder answer = new StringBuilder();
		
		for(int i=0; i<scores.length; i++) {
			int self = 0;
			int sum = 0;
			int cnt =0;
			double avg;
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			for(int j=0; j<scores[i].length;j++) {
				int val = scores[j][i];
				if(i==j) {
					self = val;
					continue;
				}
				sum+=val;
				cnt++;
				if(max<val) max=val;
				if(min>val) min=val;
			}
			if(!(min>self || max<self)) {
				sum+=self;
				cnt++;
			}
			avg=(double)sum/cnt;
			if(avg>=90) answer.append("A");
			else if(avg>=80) answer.append("B");
			else if(avg>=70) answer.append("C");
			else if(avg>=50) answer.append("D");
			else answer.append("F");
		}
        return answer.toString();
    }
}
