package programmers.level02;
/**
 * https://programmers.co.kr/learn/courses/30/lessons/12899?language=java
 *  
 *  연습문제 - 124나라
 *
 */
public class No_01 {
	public static void main(String[] args) {
		System.out.println(new No_01().solution(4));
	}
	public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        
        while(n>0) {
        	boolean flag = n%3==0;
        	sb.append(n%3);
        	n/=3;
        	if(flag) {
        		n--;
        	}
        }
        return sb.reverse().toString().replaceAll("0", "4");
    }
}


