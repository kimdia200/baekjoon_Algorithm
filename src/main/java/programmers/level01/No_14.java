package programmers.level01;
/**
 * https://programmers.co.kr/learn/courses/30/lessons/81301
 * 
 * 2021 카카오 채용연계형 인턴쉽 - 숫자 문자열과 영단어
 *
 */
public class No_14 {
	public static void main(String[] args) {
		System.out.println(new No_14().solution("one4seveneight"));
	}
	
	public int solution(String s) {

		String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < strArr.length; i++) {
            s = s.replaceAll(strArr[i], Integer.toString(i));
        }
        
        return Integer.parseInt(s);
    }
}
