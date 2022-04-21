package inflearn.step08_DFS_BFS_hard;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _13_ISLAND {
    static int[] moveX = {-1,-1,-1,0,0,1,1,1};
    static int[] moveY = {-1,0,1,-1,1,-1,0,1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        boolean[][] visit = new boolean[n][n];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]==0 || visit[i][j]) continue;
                bfs(arr, visit, i, j, n);
                cnt++;
//                System.out.println(cnt+"È¸Â÷ ==================================");
//                for(int k=0; k<visit.length; k++){
//                    for(int l=0; l<visit[k].length; l++){
//                        System.out.print(visit[k][l] ? " ¡á " : " ¡à ");
//                    }
//                    System.out.println();
//                }
            }
        }
        System.out.println(cnt);
    }

    private static void bfs(int[][] arr, boolean[][] visit, int nowX, int nowY, int n) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{nowX,nowY});
        visit[nowX][nowY]=true;

        while(!q.isEmpty()){
            int[] tmp = q.poll();
            for(int k=0; k<8; k++){
                int nextX = tmp[0]+moveX[k];
                int nextY = tmp[1]+moveY[k];
                if(nextX<0 || nextX>=n || nextY<0 || nextY>=n || visit[nextX][nextY] || arr[nextX][nextY]==0) continue;
                visit[nextX][nextY]=true;
                q.add(new int[]{nextX, nextY});
            }
        }
    }
}
