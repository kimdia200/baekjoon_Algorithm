package programmers.level01;

//월간코드챌린지3 - 나머지가 1이되는 수찾기
//https://programmers.co.kr/learn/courses/30/lessons/87389
public class No_56 {
	public static void main(String[] args) {
		System.out.println(new No_56().solution(10));
	}
	
	public int solution(int n) {
		int answer = 0;
		for(int i=2; i<n; i++) {
			if(n%i==1) {
				answer=i;
				break;
			}
		}
		return answer;
    }
}
