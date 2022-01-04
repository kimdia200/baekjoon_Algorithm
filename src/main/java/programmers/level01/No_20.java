package programmers.level01;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12930#
 * 
 * 이상한 문자 만들기
 * 
 * 나의 해법 = 단어로 쪼개고 단어의 글씨 하나하나씩 들어가봄 = O(n^2)
 * 다른사람풀이 = 아예 글짜하나 하나씩 쪼개고 공백마다 인덱스 초기화 접근 = O(n)
 *
 */
public class No_20 {
	public static void main(String[] args) {
		System.out.println(new No_20().solution("try hello world"));
	}
	
	 public String solution(String s) {

	        String answer = "";
	        int cnt = 0;
	        String[] array = s.split("");

	        for(String ss : array) {
	            cnt = ss.contains(" ") ? 0 : cnt + 1;
	            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); 
	        }
	      return answer;
	  }
}
