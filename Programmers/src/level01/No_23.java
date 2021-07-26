package level01;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12916
 *
 * 연습문제 - 문자열 내 p와 y의 갯수 구하기
 *
 */
public class No_23 {
	public static void main(String[] args) {
		System.out.println(new No_23().solution("pPyy"));
	}
	boolean solution(String s) {
		int pCnt = 0;
		int yCnt = 0;
		s = s.toLowerCase();
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c == 'p') pCnt++;
			else if(c == 'y') yCnt++;
		}
        return pCnt == yCnt;
    }
}
