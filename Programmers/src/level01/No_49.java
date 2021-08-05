package level01;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/77484
 *
 * 2021 dev-matching 웹 백엔드 개발 과정 - 로또 최고순위와 최저순위
 */
public class No_49 {
	public static void main(String[] args) {
		int[] arr1 = {44, 1, 0, 0, 31, 25};
		int[] arr2 = {31, 10, 45, 1, 6, 19};
		
		System.out.println(Arrays.toString(new No_49().solution(arr1, arr2)));
	}
	public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int min = 0;
        int max = 0;
        for(int i=0; i<lottos.length; i++) {
        	if(lottos[i]==0) {
        		max++;
        		continue;
        	}
        	for(int j=0; j<win_nums.length; j++) {
        		if(lottos[i]==win_nums[j]) {
        			min++;
        			break;
        		}
        	}
        }
        max = max+min;
        
        answer[0] = lottoResult(max);
        answer[1] = lottoResult(min);
        return answer;
    }
	
	public int lottoResult(int cnt) {
		switch (cnt) {
		case 6 : return 1;
		case 5 : return 2;
		case 4 : return 3;
		case 3 : return 4;
		case 2 : return 5;
		default : return 6;
		}
	}
}
