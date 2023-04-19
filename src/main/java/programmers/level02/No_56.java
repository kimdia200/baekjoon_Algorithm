package programmers.level02;

import java.util.StringTokenizer;

//https://school.programmers.co.kr/learn/courses/30/lessons/92335
//코딩테스트 연습 2022 KAKAO BLIND RECRUITMENT k진수에서 소수 개수 구하기
public class No_56 {
    public static void main(String[] args) {
        System.out.println(new No_56().solution(110011,10));
    }
    public int solution(int n, int k) {
        int answer = 0;
        String convert = convertDigit(n,k);
        StringTokenizer st = new StringTokenizer(convert,"0");
        while (st.hasMoreTokens()){
            if(isPrime(Long.parseLong(st.nextToken()))){
                answer++;
            }
        }
        return answer;
    }

    //10진수n을 k진수로 변환
    public String convertDigit(int n, int k){
        StringBuilder sb = new StringBuilder();

        while(n>0){
            sb.append(n%k);
            n/=k;
        }
        return sb.reverse().toString();
    }

    //소수를 구하는 가장 효율적인 방식
    public boolean isPrime(long n) {
        if(n==1) return false;
        for (int i = 2; i<=(long)Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
