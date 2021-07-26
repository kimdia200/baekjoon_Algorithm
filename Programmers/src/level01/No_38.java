package level01;
/**
 * https://programmers.co.kr/learn/courses/30/lessons/12943
 *
 * �������� - �ݶ��� ����
 * 
 * �ι�° Ǭ ����� �� ����ѵ�
 */
public class No_38 {
	public static void main(String[] args) {
		System.out.println(new No_38().solution(626331));
	}
	public int solution(int num) {
        int cnt = 0;
        long n = num;
        while(n!=1 && cnt<500) {
        	//���׿����ڰ� ����ϴ�
        	n = n%2 == 0 ? n/2 : n*3+1;
        	cnt ++;
        }
        return cnt<500 ? cnt : -1;
    }
	public int solution2(int num) {
		long n = num;
		for(int i=0; i<=500; i++) {
			if(n==1) return i;
			n = n%2 == 0 ? n/2 : n*3+1;
		}
		return -1;
	}
}
