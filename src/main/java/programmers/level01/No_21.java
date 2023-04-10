package programmers.level01;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12922
 * 
 * 연습문제 - 수박수박수박수?
 *
 */
public class No_21 {
	public static void main(String[] args) {
		System.out.println(new No_21().solution(4));
	}
	public String solution(int n) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			if(i%2==0) sb.append("수");
			else sb.append("박");
		}
		return sb.toString();
    }
}
