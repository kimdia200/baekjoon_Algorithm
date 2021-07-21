package level01;
/**
 * https://programmers.co.kr/learn/courses/30/lessons/12903
 * 
 * 가운데 글자 가져오기
 * 
 * 이건 너무 쉽잖아....
 *
 */
public class No_10 {

	public static void main(String[] args) {
		No_10 n = new No_10();
		String s = "abcde";
		System.out.println(n.solution(s));
	}
	
	public String solution(String s) {
		StringBuilder sb = new StringBuilder();
		
		if(s.length()%2==0) {
			sb.append(s.charAt(s.length()/2-1));
		}
		sb.append(s.charAt(s.length()/2));
		
        return sb.toString();
    }
}
