package level01;
/**
 * https://programmers.co.kr/learn/courses/30/lessons/12919
 *
 * �������� - �輭��ã��
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
        		answer = "�輭���� "+i+"�� �ִ�";
        		break;
        	}
        }
        return answer;
    }
}
