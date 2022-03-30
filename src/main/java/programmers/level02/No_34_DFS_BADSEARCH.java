package programmers.level02;


// 코딩테스트 연습 - 찾아라 프로그래밍 마에스터 - 게임 맵 최단거리
//https://programmers.co.kr/learn/courses/30/lessons/1844d
public class No_34_DFS_BADSEARCH {
    static int min = Integer.MAX_VALUE;
    static int width;
    static int height;

    public static void main(String[] args){
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        width = maps[0].length-1;
        height = maps.length-1;

        boolean[][] visited = new boolean[height+1][width+1];
        long start = System.currentTimeMillis();
        cur(maps,visited,0,0,1);
        System.out.println(min == Integer.MAX_VALUE ? -1 : min);
        long end = System.currentTimeMillis();
        System.out.println("작동시간 : "+(end-start)+" (ms)");
    }

    public static void cur(int[][] maps, boolean[][] visited, int x, int y, int cnt){
        if(x<0 || x > width || y<0 || y> height || visited[x][y] || maps[x][y]==0){
            return;
        }
        if(x==width && y==height){
            //도착했을때
            min=Math.min(cnt,min);
            return;
        }

        cnt++;
        visited[x][y] = true;
        //상
        cur(maps,visited,x,y-1,cnt);
        //하
        cur(maps,visited,x,y+1,cnt);
        //좌
        cur(maps,visited,x-1,y,cnt);
        //우
        cur(maps,visited,x+1,y,cnt);

        visited[x][y] = false;
    }
}
