package level01;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12931
 *
 * 연습문제 - 자릿수 더하기
 * 
 * String배열과 split을 활용하면 이전보다 훨씬 간단하게 풀수있는거같다 
 * 
 * But) 아래 solution 코드는 리소스를 쓸데없이 잡아먹는 코드라고한다...
 */
public class No_32 {
	public static void main(String[] args) {
		System.out.println(new No_32().solution2(123));
	}
	public int solution(int n) {
        int answer = 0;
        	
        String[] str = String.valueOf(n).split("");
        for(int i=0; i<str.length; i++) {
        	answer += Integer.parseInt(str[i]);
        }
        
        return answer;
    }
	//과거의 방식으로 풀면 조금 가독성은 떨어져도 리소스를 잡아먹지 않는코드
	public int solution2(int n) {
		int answer = 0;
		
		while(n>0) {
			answer += n%10;
			n /= 10;
		}
		
		return answer;
	}
}
