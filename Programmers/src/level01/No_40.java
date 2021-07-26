package level01;
/**
 * https://programmers.co.kr/learn/courses/30/lessons/12947
 *
 * 연습문제 - 하샤드의 수
 * 
 * 첫번째가 더 좋은 코드
 */
public class No_40 {
	public static void main(String[] args) {
		System.out.println(new No_40().solution(13));
	}
	public boolean solution(int x) {
		int sum = 0;
		int num = x;
		while(num>0) {
			sum += num%10;
			num/=10;
		}
        return x%sum==0;
    }
	
	public boolean solution2(int x) {
		int sum = 0;
		String[] arr = String.valueOf(x).split("");
		for(String s : arr) {
			sum+=Integer.parseInt(s);
		}
		return x % sum == 0;
	}
}
