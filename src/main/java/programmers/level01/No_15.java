package programmers.level01;
/**
 * 
 * https://programmers.co.kr/learn/courses/30/lessons/12912
 * 
 * 연습문제 - 두정수 사이의 합
 *
 */
public class No_15 {
	public static void main(String[] args) {
		System.out.println(new No_15().solution(3, 5));
	}
	
	public long solution(int min, int max) {
		int temp;
		if(min>max) {
			temp = min;
			min = max;
			max = temp;
		}
		
		long sum = 0;
		for(int i=min; i<=max; i++) {
			sum+=i;
		}
		
		return sum;
    }
}
