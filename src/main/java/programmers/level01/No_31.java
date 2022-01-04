package programmers.level01;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12925
 *
 * 연습문제 - 문자열을 정수로 바꾸기
 * 
 * 조건을 보면 그냥 리턴 쳐도 되는데 뭐한거진
 */
public class No_31 {
	public static void main(String[] args) {
		System.out.println(new No_31().solution("+1234"));
	}
	
	public int solution(String s) {
        int answer = 0;
        boolean minus = false;
        s = s.replace("+", "");
        if(s.contains("-")) {
        	s = s.replace("-", "");
        	minus = true;
        }
        answer = Integer.parseInt(s);
        if(minus) {
        	answer*=(-1);
        }
        return answer;
    }
	
	//아 그냥 이렇게 하면 되는데 ㅋㅋㅋㅋㅋㅋ
	public int solution0(String s) {
		return Integer.parseInt(s);
	}
}
