package level01;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12931
 *
 * �������� - �ڸ��� ���ϱ�
 * 
 * String�迭�� split�� Ȱ���ϸ� �������� �ξ� �����ϰ� Ǯ���ִ°Ű��� 
 * 
 * But) �Ʒ� solution �ڵ�� ���ҽ��� �������� ��ƸԴ� �ڵ����Ѵ�...
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
	//������ ������� Ǯ�� ���� �������� �������� ���ҽ��� ��Ƹ��� �ʴ��ڵ�
	public int solution2(int n) {
		int answer = 0;
		
		while(n>0) {
			answer += n%10;
			n /= 10;
		}
		
		return answer;
	}
}
