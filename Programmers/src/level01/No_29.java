package level01;
/**
 * https://programmers.co.kr/learn/courses/30/lessons/12926
 *
 * 연습문제 - 시저암호
 */
public class No_29 {
	public static void main(String[] args) {
		System.out.println(new No_29().solution("z", 1));
	}
	public String solution(String s, int n) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int gap = 'z'-'a'+1;
        for(char c : arr) {
        	if(c>='a' && c<='z') {
        		c+=n;
        		if(c>'z') {
        			c-=gap;
        		}
        	}else if(c>='A' && c<='Z') {
        		c+=n;
        		if(c>'Z') {
        			c-=gap;
        		}
        	}
        	sb.append(c);	
        }
        return sb.toString();
    }
}
