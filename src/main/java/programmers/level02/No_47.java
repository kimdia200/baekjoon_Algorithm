package programmers.level02;
//https://school.programmers.co.kr/learn/courses/30/lessons/12980
//코딩테스트 연습 Summer/Winter Coding(~2018) 점프와 순간 이동
public class No_47 {
    public int solution(int n) {
        int ans = 1;
        while(n>1){
            if(n%2!=0){
                ans++;
            }
            n/=2;
        }
        return ans;
    }
}
