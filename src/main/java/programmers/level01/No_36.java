package programmers.level01;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12934
 *
 * 연습문제 - 제곱근 판별
 * 
 * 간단한 문제가 더 괴물이 많네
 */
public class No_36 {
	public static void main(String[] args) {
		System.out.println(new No_36().solution2(121));
	}
	public long solution(long n) {
		double x = Math.sqrt(n);
		if(x*10%10 == 0) {
			x++;
			return (long)(x*x); 
		}
		return -1;
    }
	
	public long solution2(long n) {
		double sqrt = Math.sqrt(n);
		return Math.floor(sqrt) == sqrt ? (long)Math.pow(sqrt+1, 2) : -1;
	}
}
