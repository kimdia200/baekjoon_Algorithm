package programmers.level01;

public class No_27 {
	public static void main(String[] args) {
		System.out.println(new No_27().solution0(10));
	}
	
	//�ð��ʰ� ����..... n = 2~ 10000000 �̶� O(n^2)�� 1�� �ξ� �ʰ���...
	//�ð����⵵���� ���� Ƚ���� ���̷��� �Ҽ��� �˻�� j�� �����ٱ����� �˻��Ͽ� ��ȸ�ϸ� ����Ƚ���� ���� ���ϼ����� 
	//�߿��ϴ� �޸��ص���
	public int solution0(int n) {
        int answer = 0;
        outter:
        for(int i=2; i<=n; i++) {
        	for(int j=2; j<=Math.sqrt(i); j++) {
        		if(i%j==0) continue outter;
        	}
        	answer++;
        }
        return answer;
    }
}
