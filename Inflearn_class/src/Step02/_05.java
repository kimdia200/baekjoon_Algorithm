package Step02;

import java.util.Scanner;

//¼Ò¼ö
public class _05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(new _05().solution(n));
	}
	public int solution(int n) {
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
