package programmers.level01;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12930#
 * 
 * �̻��� ���� �����
 * 
 * ���� �ع� = �ܾ�� �ɰ��� �ܾ��� �۾� �ϳ��ϳ��� ���� = O(n^2)
 * �ٸ����Ǯ�� = �ƿ� ��¥�ϳ� �ϳ��� �ɰ��� ���鸶�� �ε��� �ʱ�ȭ ���� = O(n)
 *
 */
public class No_20 {
	public static void main(String[] args) {
		System.out.println(new No_20().solution("try hello world"));
	}
	
	 public String solution(String s) {

	        String answer = "";
	        int cnt = 0;
	        String[] array = s.split("");

	        for(String ss : array) {
	            cnt = ss.contains(" ") ? 0 : cnt + 1;
	            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); 
	        }
	      return answer;
	  }
}
