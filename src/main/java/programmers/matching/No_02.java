package programmers.matching;

import java.util.Arrays;

public class No_02 {
    public static void main(String[] args) {
        No_02 m = new No_02();
        int n=4;
        boolean horizontal = true;
        System.out.println(Arrays.deepToString(m.solution(n, horizontal)));
    }
    public int[][] solution(int n, boolean horizontal) {
        int[][] answer = new int[n][n];
        int cnt = 1;
        int x=0;
        int y=9;
        while(cnt<=n*n){
            answer[x][y]=cnt++;
            if(x>y){

            }
            if(horizontal){
                x++;
            }else{
                y++;
            }
            horizontal=!horizontal;
        }

        return answer;
    }
}
