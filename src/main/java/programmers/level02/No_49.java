package programmers.level02;

//https://school.programmers.co.kr/learn/courses/30/lessons/12914
//코딩테스트 연습 연습문제 멀리 뛰기
//피보나치 메모이제이션
public class No_49 {
    public static void main(String[] args) {
        System.out.println(new No_49().solution(2000));
    }


    public long solution(int n) {
        long[] answer = new long[n+1];
        answer[0]=1;
        answer[1]=1;
        for(int i=2; i<=n; i++){
            answer[i]=(answer[i-2]+answer[i-1])%1234567;
        }
        return answer[n];
    }
}
