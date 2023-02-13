package programmers.level01;

//https://school.programmers.co.kr/learn/courses/30/lessons/140108
//코딩테스트 연습
//연습문제
//문자열 나누기

public class No_70 {
    public static void main(String[] args) {
        System.out.println(new No_70().solution("banana"));
    }

    public int solution(String s) {
        int answer = 1;
        char base = ' ';
        int eq=0;
        int neq=0;
        for(int i=0; i<s.length()-1; i++){
            char c = s.charAt(i);
            if(base==' ') base=c;
            if(base==c){
                eq++;
            }else{
                neq++;
            }

            if(eq==neq){
                eq=0;
                neq=0;
                base=' ';
                answer++;
            }
        }

        return answer;
    }
}
