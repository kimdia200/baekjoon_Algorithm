package inflearn.step08_DFS_BFS_hard;

import java.util.Date;
import java.util.Scanner;

public class _07_nCr_memoization_DFS {
    //ex1) n=5 r=3 answer=10
    //ex2) n=33 r=19 answer=818809200;
    public static void main(String[] args) {
        _07_nCr_memoization_DFS m = new _07_nCr_memoization_DFS();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int[][] arr = new int[n+1][r+1];

        long start = new Date().getTime();
        System.out.println(m.dfs_memoization(arr, n, r));
        long diff = new Date().getTime()-start;
        System.out.println("메모이제이션 소요시간 = "+diff);

        start = new Date().getTime();
        System.out.println(m.dfs(n, r));
        diff = new Date().getTime()-start;
        System.out.println("비 메모이제이션 소요시간 = "+diff);
    }

    // 종료조건 r==0일때는 1, n==r 일때는 1
    //이 개념을 알고있어야 풀 수 있다...
    private int dfs(int n, int r) {
        if(r==0 || n==r) return 1;
        return dfs(n-1, r-1)+dfs(n-1,r);
    }

    private int dfs_memoization(int[][] arr, int n, int r) {
        if(arr[n][r] > 0) return arr[n][r];
        if(n==r || r==0) return 1;
        return arr[n][r]=dfs_memoization(arr,n-1, r-1)+dfs_memoization(arr,n-1,r);
    }
}