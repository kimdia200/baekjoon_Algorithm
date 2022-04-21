package inflearn.step08_DFS_BFS_hard;

import java.util.Scanner;

public class _10_DFS±Ê√£±‚ {
    static int[] moveX = {0,0,-1,1};
    static int[] moveY = {-1,1,0,0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] map = new int[7][7];
        boolean[][] visit = new boolean[7][7];

        for(int i=0; i<map.length; i++){
            for (int j=0; j<map[i].length; j++){
                map[i][j]=sc.nextInt();
            }
        }
        visit[0][0] = true;
        System.out.println(dfs(map, visit,0,0));
    }

    private static int dfs(int[][] map, boolean[][] visit, int x, int y) {
        int answer = 0;
        if(x==6 && y==6){
            return 1;
        }
        for(int i=0; i<4; i++){
          int nx = x+moveX[i];
          int ny = y+moveY[i];
          if(nx<0 || nx>=7 || ny<0 || ny>=7 || visit[ny][nx] || map[ny][nx] == 1){
              continue;
          }
          visit[ny][nx]=true;
          answer += dfs(map, visit, nx,ny);
          visit[ny][nx]=false;
        }
        return answer;
    }
}

//0 0 0 0 0 0 0
//0 1 1 1 1 1 0
//0 0 0 1 0 0 0
//1 1 0 1 0 1 1
//1 1 0 0 0 0 1
//1 1 0 1 1 0 0
//1 0 0 0 0 0 0
