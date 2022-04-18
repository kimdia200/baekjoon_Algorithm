package inflearn.step08_DFS_BFS_hard;

import java.util.Scanner;

public class _08 {
    static int target;
    boolean flag = false;
    public static void main(String[] args) {
        _08 m = new _08();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        target = sc.nextInt();

        m.solution(n);

    }

    private void solution(int n) {
        int[] base = new int[n];
        boolean[] visit = new boolean[n];
        for(int i=0; i<n; i++){
            base[i] = i+1;
        }
        int[] result = new int[n];
        dfs(base,visit,result,0);
    }

    private void dfs(int[] base, boolean[] visit, int[] result, int idx) {
        if(flag) return;
        if(idx==result.length){
            if(cal(result)!=target) return;
            for(int i=0; i<result.length; i++){
                System.out.print(result[i]);
                System.out.print(i==result.length-1 ? "" : " ");
            }
            flag = true;
            return;
        }
        for(int i=0; i<base.length; i++){
            if(visit[i]) continue;
            result[idx]=base[i];
            visit[i]=true;
            dfs(base,visit,result,idx+1);
            visit[i]=false;
        }
    }

    private int cal(int[] arr) {
        if(arr.length==1) return arr[0];
        int[] tmp = new int[arr.length-1];
        for(int i=0; i<arr.length-1; i++){
            tmp[i] = arr[i]+arr[i+1];
        }
        return cal(tmp);
    }
}
