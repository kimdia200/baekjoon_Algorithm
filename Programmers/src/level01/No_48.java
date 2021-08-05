package level01;
/**
 * https://programmers.co.kr/learn/courses/30/lessons/82612
 *
 * 위클리챌린지  - 1주차
 */
public class No_48 {
	public static void main(String[] args) {
		System.out.println(new No_48().solution(3, 20, 4));
	}
	public long solution(int price, int money, int count) {
		long sum=0;
		for(int i=1; i<=count;i++) {
			sum+=i*price;
		}
		return money>sum ? 0 : Math.abs(money-sum);
	}
}
