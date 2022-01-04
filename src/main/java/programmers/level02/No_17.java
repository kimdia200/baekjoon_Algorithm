package programmers.level02;

import java.util.Arrays;

//H-index
public class No_17 {
	public static void main(String[] args) {
		int[] citations = {3, 0, 6, 1, 5};
		System.out.println(new No_17().solution2(citations));
	}
	public int solution(int[] citations) {
        int answer = 0;
        
        int max = Arrays.stream(citations).max().getAsInt();
        Arrays.sort(citations);
        for(int i=max; i>=0; i--) {
        	if(check(citations,i)) {
        		answer=i;
        		break;
        	}
        }
        return answer;
    }
	public boolean check(int[] citations, int n) {
		int cnt = 0;
		for(int i : citations) {
			if(i>=n) cnt++;
		}
		return cnt>=n;
	}

	//다른사람풀이인데 천재인듯....
	public int solution2(int[] citations) {
        Arrays.sort(citations);
        int max = 0;
        for(int i=citations.length-1; i>=0; i--) {
        	int min=Math.min(citations[i],citations.length-i);
        	max=Math.max(max, min);
        }
        return max;
    }
}
