package level01;
/**
 * https://programmers.co.kr/learn/courses/30/lessons/12919
 *
 * 연습문제 - 김서방찾기
 */
public class No_28 {
	public static void main(String[] args) {
		String[] arr = {"Jane","Kim"};
		System.out.println(new No_28().solution(arr));
	}
	
	public String solution(String[] seoul) {
        String answer = null;
        for(int i=0; i<seoul.length; i++) {
        	if(seoul[i].equals("Kim")) {
        		answer = "김서방은 "+i+"에 있다";
        		break;
        	}
        }
        return answer;
    }
}
