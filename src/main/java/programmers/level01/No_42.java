package programmers.level01;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12948
 *
 * �������� �ڵ��� ��ȣ ������
 * 
 * �ι�° �ڵ尡 �ξ� �ð����⵵�� ����
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
