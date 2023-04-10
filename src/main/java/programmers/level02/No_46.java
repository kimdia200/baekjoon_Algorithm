package programmers.level02;
//https://school.programmers.co.kr/learn/courses/30/lessons/12911
//코딩테스트 연습
//연습문제
//다음 큰 숫자
public class No_46 {
    public static void main(String[] args) {
        System.out.println(new No_46().solution(78));
    }
    public int solution(int n) {
        int cntN = count(n);
        int m = n;
        int cntM=0;
        do{
            m++;
            cntM = count(m);
        }while (cntN!=cntM);

        return m;
    }

    public int count(int n){
        int cnt = 0;
        char[] temp = Integer.toBinaryString(n).toCharArray();
        for(char c : temp){
            if(c=='1'){
                cnt++;
            }
        }
        return cnt;
    }
}
