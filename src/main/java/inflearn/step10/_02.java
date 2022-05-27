package inflearn.step10;

import java.util.Scanner;

public class _02 {
    static int cnt;
    static int target;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        target = sc.nextInt()+1;
        
        dfs(0);
        System.out.println(cnt);
    }

    private static void dfs(int now) {
        if(now == target){
            cnt++;
            return;
        }else if(now > target) return;
        dfs(now+1);
        dfs(now+2);
    }
}
