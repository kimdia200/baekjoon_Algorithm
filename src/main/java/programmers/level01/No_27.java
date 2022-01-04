package programmers.level01;

public class No_27 {
	public static void main(String[] args) {
		System.out.println(new No_27().solution0(10));
	}
	
	//시간초과 나옴..... n = 2~ 10000000 이라서 O(n^2)은 1억 훨씬 초과됨...
	//시간복잡도에서 시행 횟수를 줄이려면 소수의 검사는 j를 제곱근까지만 검색하여 조회하면 시행횟수를 많이 줄일수있음 
	//중요하니 메모해두자
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
