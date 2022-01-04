package programmers.level01;
/**
 * https://programmers.co.kr/learn/courses/30/lessons/68935
 * 
 * 월간 코드챌린지1 - 3진법 뒤집기
 *
 */
public class No_50 {
	public static void main(String[] args) {
		System.out.println(new No_50().solution2(45));
	}
	public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        while(n>0) {
        	sb.append(n%3);
        	n/=3;
        }
        String[] arr = sb.reverse().toString().split("");
        for(int i=0; i<arr.length; i++) {
        	answer += Math.pow(3, i)*Integer.parseInt(arr[i]);
        }
        return answer;
    }
	
	//다른사람의 답안에서 Integer.parseInt(charseq, int) 의 사용법을 배웠다
	//1번째 파라미터 = 숫자, 2번째 파라미터 = 몇진수로 되어있는지
	//리턴값 = 10진수
	public int solution2(int n) {
		StringBuilder sb = new StringBuilder();
        while(n>0) {
        	sb.append(n%3);
        	n/=3;
        }
        return Integer.parseInt(sb.toString(), 3);
	}
}

