package inflearn.step08_DFS_BFS_hard;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _11_BFS_TOMATO {
    static int[] moveN = {-1,1,0,0};
    static int[] moveM = {0,0,-1,1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[n][m];
        int[][] visit = new int[n][m];
        Queue<int[]> q = new LinkedList<>();
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
                if(arr[i][j]==1) q.add(new int[]{i, j});
            }
        }

        System.out.println(bfs(arr, visit, q));
    }

    private static int bfs(int[][] arr, int[][] visit, Queue<int[]> q) {
        while(!q.isEmpty()){
            int[] tmp = q.poll();
            int n = tmp[0];
            int m = tmp[1];
            for(int i=0; i<4; i++){
                int nextN = n+moveN[i];
                int nextM = m+moveM[i];
                if(nextN<0 || nextN>=arr.length || nextM<0 || nextM>=arr[0].length || visit[nextN][nextM]!=0 || arr[nextN][nextM]!=0) continue;
                arr[nextN][nextM]=1;
                visit[nextN][nextM]=visit[n][m]+1;
                q.add(new int[] {nextN, nextM});
            }
        }
        return count(arr,visit);
    }

    private static int count(int[][] arr, int[][] visit){
        int cnt = 0;
        for(int i=0; i<arr.length; i++ ){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]== 0) cnt++;
            }
        }
        if(cnt!=0) return -1;

        int max = 0;
        for(int i=0; i<visit.length; i++){
            for(int j=0; j<visit[i].length; j++){
                max = Math.max(max, visit[i][j]);
            }
        }
        return max;
    }
}
