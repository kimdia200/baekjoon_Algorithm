package inflearn.step08_DFS_BFS_hard;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _11_BFS_길찾기 {
static int[] moveX = {0,0,-1,1};
static int[] moveY = {-1,1,0,0};

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] map = new int[7][7];
        int[][] visit = new int[7][7];

        for (int i=0; i<map.length; i++){
        for(int j=0; j<map[i].length; j++){
        map[i][j]=sc.nextInt();
        }
        }

        Queue<int[]> q = new LinkedList<>();

        int cnt = bfs(map, visit, q);
        System.out.println(cnt);
        }

private static int bfs(int[][] map, int[][] visit, Queue<int[]> q) {
        int answer = -1;

        q.add(new int[] {0,0});
        while(!q.isEmpty()){
        int[] tmp = q.poll();
        int nowY = tmp[0];
        int nowX = tmp[1];
        if (nowX==6 &&nowY==6){
        answer = visit[nowY][nowX];
        break;
        }
        for(int i=0; i<4; i++){
        int nextY = nowY+moveY[i];
        int nextX = nowX+moveX[i];
        if(nextY<0 || nextY>=7 || nextX<0 || nextX>=7 || visit[nextY][nextX]>0 || map[nextY][nextX]==1) continue;
        visit[nextY][nextX] = visit[nowY][nowX]+1;
        q.add(new int[] {nextY, nextX});
        }
        }

        return answer;
        }
        }