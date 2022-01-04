package programmers.level01;
/**
 * https://programmers.co.kr/learn/courses/30/lessons/68935
 * 
 * ���� �ڵ�ç����1 - 3���� ������
 *
 */
public class No_50 {
	public static void main(String[] args) {
		System.out.println(new No_50().solution2(45));
	}
	public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        while(n>0) {
        	sb.append(n%3);
        	n/=3;
        }
        String[] arr = sb.reverse().toString().split("");
        for(int i=0; i<arr.length; i++) {
        	answer += Math.pow(3, i)*Integer.parseInt(arr[i]);
        }
        return answer;
    }
	
	//�ٸ������ ��ȿ��� Integer.parseInt(charseq, int) �� ������ �����
	//1��° �Ķ���� = ����, 2��° �Ķ���� = �������� �Ǿ��ִ���
	//���ϰ� = 10����
	public int solution2(int n) {
		StringBuilder sb = new StringBuilder();
        while(n>0) {
        	sb.append(n%3);
        	n/=3;
        }
        return Integer.parseInt(sb.toString(), 3);
	}
}

