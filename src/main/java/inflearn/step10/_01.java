package inflearn.step10;

import java.util.Scanner;

public class _01 {

    static int cnt;
    static int target;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        target = sc.nextInt();
        dfs(0);
        System.out.println(cnt);
    }

    public static void dfs(int sum){
        if(sum==target){
            cnt++;
            return;
        }else if(sum>target) return;
        dfs(sum+1);
        dfs(sum+2);
    }
}
