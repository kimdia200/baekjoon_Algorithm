package programmers.matching;

import java.util.*;

public class No_03 {
    public static void main(String[] args) {
        int[][] lands = {{2,2},{2,3},{2,4},{3,2},{3,5},{4,3},{4,4}};
        System.out.println(Arrays.toString(new No_03().solution(5,6, lands)));
    }
    //상하좌우
    int[] moveI = {-1,1,0,0};
    int[] moveJ = {0,0,-1,1};

    public int[] solution(int rows, int columns, int[][] lands) {
        int[] answer = {};
        List<Integer> hosu = new ArrayList<>();
        int hosuNumber = 3;
        int[][] map = new int[rows][columns];
        //땅표시 땅은1
        for(int i=0; i<lands.length; i++) {
            map[lands[i][0]-1][lands[i][1]-1] = 1;
        }
        //바다 검사 바다는2
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0});
        while (!q.isEmpty()){
            int[] now = q.poll();
            int nowI = now[0];
            int nowJ = now[1];
            map[nowI][nowJ] = 2;
            for(int i=0; i<4 ; i++){
                int nextI = now[0]+moveI[i];
                int nextJ = now[1]+moveJ[i];

                if(nextI>=0 && nextJ>=0 && nextI <rows && nextJ <columns){
                    if(map[nextI][nextJ]!=0) continue;
                    q.add(new int[]{nextI,nextJ});
                }
            }
        }

        //호수 넘버링
        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[i].length; j++){
                if(map[i][j]!=0) continue;
                q.add(new int[]{i,j});
                while(!q.isEmpty()){
                    int[] now = q.poll();
                    int nowI = now[0];
                    int nowJ = now[1];
                    map[nowI][nowJ] = hosuNumber;
                    for(int k=0; k<4 ; k++){
                        int nextI = now[0]+moveI[k];
                        int nextJ = now[1]+moveJ[k];

                        if(nextI>=0 && nextJ>=0 && nextI <rows && nextJ <columns){
                            if(map[nextI][nextJ]!=0) continue;
                            q.add(new int[]{nextI,nextJ});
                        }
                    }
                }
                hosu.add(hosuNumber);
                hosuNumber++;
            }
        }
        if(hosuNumber==3) return new int[]{-1,-1};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<hosu.size(); i++){
            hosuNumber = hosu.get(i);
            int cnt = 0;
            for(int j=0; j<map.length; j++){
                for(int k=0; k<map[j].length; k++){
                    if(map[j][k]==hosuNumber) cnt++;
                }
            }
            max = Math.max(max,cnt);
            min = Math.min(min,cnt);
        }

        return new int[]{min, max};
    }
}
