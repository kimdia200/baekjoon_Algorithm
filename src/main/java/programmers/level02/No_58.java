package programmers.level02;
//https://school.programmers.co.kr/learn/courses/30/lessons/17687
//코딩테스트 연습 2018 KAKAO BLIND RECRUITMENT [3차] n진수 게임
public class No_58 {
    public static void main(String[] args) {
        System.out.println(new No_58().solution(16, 16, 2, 2));
    }

    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();

        //m*t까지 일단 구하자
        StringBuilder sb = new StringBuilder();

        for(int i=0; t*m>sb.length(); i++){
            String temp = Integer.toString(i,n);
            sb.append(temp);
        }

        for(int i=0; i<t; i++){
            answer.append(sb.charAt(i*m+p-1));
        }
        return answer.toString().toUpperCase();
    }
}
