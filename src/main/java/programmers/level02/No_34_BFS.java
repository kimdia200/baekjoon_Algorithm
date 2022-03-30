package programmers.level02;

import java.util.LinkedList;
import java.util.Queue;

public class No_34_BFS {

    int[] dX = {1,0,-1,0};
    int[] dY = {0,1,0,-1};
    public static void main(String[] args) {
        int[][] maps = {
                {1,0,1,1,1},
                {1,0,1,0,1},
                {1,0,1,1,1},
                {1,1,1,0,1},
                {0,0,0,0,1}
        };
        long start = System.currentTimeMillis();
        System.out.println(new No_34_BFS().solution(maps));
        long end = System.currentTimeMillis();
        System.out.println("�۵��ð� : "+(end-start)+" (ms)");
    }

    private int solution(int[][] maps) {
        int answer = 0;

        int[][] visted = new int[maps.length][maps[0].length];

        bfs(maps, visted);
        answer = visted[maps.length-1][maps[0].length-1];

        if(answer==0){
            answer = -1;
        }
        return answer;
    }

    private void bfs(int[][] maps, int[][] visited){
        int x = 0;
        int y = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = 1;

        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int cX = current[0];
            int cY = current[1];

            //4���� �˻�
            for(int i=0; i<4; i++){
                int nX = cX + dX[i];
                int nY = cY + dY[i];

                //������ �ʰ� �Ǹ� ����
                if(nX <0 || nX > maps.length-1 || nY <0 || nY >maps[0].length-1){
                    continue;
                }

                //�湮������ ���� ���̾ƴ� ���̸� ��Ͽ� �߰�
                if(visited[nX][nY] == 0 && maps[nX][nY] == 1){
                    //�̺��� �湮�����̾����� 0, �湮������ ��������� �̵�Ƚ���� ����س�����
                    visited[nX][nY] = visited[cX][cY]+1;
                    queue.add(new int[]{nX, nY});
                }
            }
        }
    }
}
