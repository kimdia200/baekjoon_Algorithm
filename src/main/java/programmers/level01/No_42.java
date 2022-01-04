package programmers.level01;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12948
 *
 * 연습문제 핸드폰 번호 가리기
 * 
 * 두번째 코드가 훨씬 시간복잡도가 적다
 */
public class No_42 {
	public static void main(String[] args) {
		System.out.println(new No_42().solution("01033334444"));
	}
	
	public String solution(String s) {
		return s.substring(0,s.length()-4).replaceAll("[0-9]", "*")+s.substring(s.length()-4);
    }
	
	public String solution2(String s) {
		char[] ch = s.toCharArray();
	    for(int i = 0; i < ch.length - 4; i ++){
	    	ch[i] = '*';
	    }
	    return String.valueOf(ch);
	}
}
