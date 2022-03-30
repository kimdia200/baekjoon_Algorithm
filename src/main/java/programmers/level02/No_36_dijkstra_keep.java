package programmers.level02;

import java.util.Arrays;

//코딩테스트연습 - Summer/Winter Coding(~2018) - 배달
//https://programmers.co.kr/learn/courses/30/lessons/12978
public class No_36_dijkstra_keep {
    public static void main(String[] args) {
        int n =6;
        int[][] road = {{1,2,1},{1,3,2},{2,3,2},{3,4,3},{3,5,2},{3,5,3},{5,6,1}};
        int k = 4;
        System.out.println(new No_36_dijkstra_keep().solution(n,road,k));
    }

    public int solution(int N, int[][] road, int K) {
        int answer = 0;

        int[][] map = new int[N][N];
        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[i].length; j++){
                if(i==j) map[i][j]=0;
                else map[i][j] = 1000000;
            }
        }
        //초기화
        for (int[] ints : road) {
            int start = ints[0];
            int end = ints[1];
            int distance = ints[2];
            map[start - 1][end - 1] = Math.min(distance, map[start - 1][end - 1]);
            map[end - 1][start - 1] = Math.min(distance, map[start - 1][end - 1]);
        }

        //방문한 노드
        boolean[] v = new boolean[N];

        //최단거리
        int base = 0;
        int[] dis = map[base];
        v[base] = true;
        int idx;
        while((idx=getSmallIndex(dis,v,base))!= -1){
            dijkstra(idx, map, dis);
        }

        //정답 추출
        for(int i : dis){
            if(i<=K){
                answer++;
            }
        }
        return answer;
    }

    public int getSmallIndex(int[] dis, boolean[] v, int base){
        int idx=-1;
        int min=1000000;
        for(int i=0; i<dis.length; i++){
            if(v[i] || i==base || dis[i]==1000000){
                continue;
            }
            if(min>dis[i]){
                idx=i;
                min=dis[i];
            }
        }
        if(idx!=-1){
            v[idx]=true;
//            System.out.println("idx = "+idx);
        }
        return idx;
    }

    public void dijkstra(int mid, int[][] map, int[] dis){
        for(int i=0; i<dis.length; i++){
            if(map[mid][i]==1000000) continue;
            dis[i] = Math.min(dis[i],dis[mid]+map[mid][i]);
        }
//        System.out.println(Arrays.toString(dis));
    }
}
