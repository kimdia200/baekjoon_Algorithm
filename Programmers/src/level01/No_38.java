package level01;
/**
 * https://programmers.co.kr/learn/courses/30/lessons/12943
 *
 * 연습문제 - 콜라츠 추측
 * 
 * 두번째 푼 방식이 더 깔끔한듯
 */
public class No_38 {
	public static void main(String[] args) {
		System.out.println(new No_38().solution(626331));
	}
	public int solution(int num) {
        int cnt = 0;
        long n = num;
        while(n!=1 && cnt<500) {
        	//삼항연산자가 깔끔하다
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
