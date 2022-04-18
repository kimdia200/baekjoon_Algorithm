package inflearn.step08_DFS_BFS_hard;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _05 {
    static int cnt=Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean[] visit = new boolean[num];
        Integer[] arr = new Integer[num];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());
        int idx=0;
        dfs(arr, visit, idx, target);
        System.out.println(cnt);
    }
    private static void dfs(Integer[] arr, boolean[] visit, int idx, int target) {
        if(idx==arr.length){
            System.out.println(Arrays.toString(visit));
            int cnt = 0;
            for(int i=0; i<arr.length; i++){
                if(visit[i]){
                     cnt+=target/arr[i];
                     target%=arr[i];
                }
            }
            if(target==0){
                _05.cnt=Math.min(_05.cnt, cnt);
            }
            return;
        }
        visit[idx]=true;
        dfs(arr, visit, idx+1, target);
        visit[idx]=false;
        dfs(arr, visit, idx+1, target);
    }
}
