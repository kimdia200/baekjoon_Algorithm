package level01;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12944
 *
 * 평균
 * 
 * 너무쉽....
 * 
 * 스트림 보기는 좋긴한데 시간복잡도 개쓰레긴데?....
 */
public class No_39 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		System.out.println(new No_39().solution2(arr));
	}
	public double solution(int[] arr) {
        double answer = 0;
        for(int x : arr) {
        	answer += x;
        }
        return answer/arr.length;
    }
	
	public double solution2(int[] arr) {
		return Arrays.stream(arr).average().orElse(0);
	}
}
