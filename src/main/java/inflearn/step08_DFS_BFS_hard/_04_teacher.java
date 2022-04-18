package inflearn.step08_DFS_BFS_hard;

import java.util.Scanner;

public class _04_teacher {
    static int n, m;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m];

        dfs(0);
    }

    private static void dfs(int idx) {
        if(idx==arr.length){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]);
            }
            System.out.println();
            return;
        }
        for(int i=1; i<=n; i++){
            arr[idx] = i;
            dfs(idx+1);
        }
    }
}
