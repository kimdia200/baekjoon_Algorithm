package programmers.level01;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12925
 *
 * �������� - ���ڿ��� ������ �ٲٱ�
 * 
 * ������ ���� �׳� ���� �ĵ� �Ǵµ� ���Ѱ���
 */
public class No_31 {
	public static void main(String[] args) {
		System.out.println(new No_31().solution("+1234"));
	}
	
	public int solution(String s) {
        int answer = 0;
        boolean minus = false;
        s = s.replace("+", "");
        if(s.contains("-")) {
        	s = s.replace("-", "");
        	minus = true;
        }
        answer = Integer.parseInt(s);
        if(minus) {
        	answer*=(-1);
        }
        return answer;
    }
	
	//�� �׳� �̷��� �ϸ� �Ǵµ� ������������
	public int solution0(String s) {
		return Integer.parseInt(s);
	}
}
