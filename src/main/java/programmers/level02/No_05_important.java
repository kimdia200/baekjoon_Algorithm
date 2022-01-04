package programmers.level02;

//https://velog.io/@ajufresh/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EB%A9%80%EC%A9%A1%ED%95%9C-%EC%82%AC%EA%B0%81%ED%98%95-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4-Java
//멀쩡한 사각형
//최대공약수를 구하는 방법은 유클리드 호제법 사용함
public class No_05_important {
	
	public static void main(String[] args) {
		System.out.println(new No_05_important().solution(8, 12));
	}
	
	public long solution(int w, int h) {
        long answer;
        
        int gcd;
        int big = Math.max(w, h);
        int small = Math.min(w, h);
        
        while(big%small!=0) {
        	int remain = big%small;
        	big=small;
        	small=remain;
        }
        gcd = small;
        
        answer = ((long)w*h)-gcd*((w/gcd)+(h/gcd)-1);
        
        return answer;
    }
}
