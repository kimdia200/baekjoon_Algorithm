package programmers.level02;


// �ڵ��׽�Ʈ ���� - ã�ƶ� ���α׷��� �������� - ���� �� �ִܰŸ�
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
        System.out.println("�۵��ð� : "+(end-start)+" (ms)");
    }

    public static void cur(int[][] maps, boolean[][] visited, int x, int y, int cnt){
        if(x<0 || x > width || y<0 || y> height || visited[x][y] || maps[x][y]==0){
            return;
        }
        if(x==width && y==height){
            //����������
            min=Math.min(cnt,min);
            return;
        }

        cnt++;
        visited[x][y] = true;
        //��
        cur(maps,visited,x,y-1,cnt);
        //��
        cur(maps,visited,x,y+1,cnt);
        //��
        cur(maps,visited,x-1,y,cnt);
        //��
        cur(maps,visited,x+1,y,cnt);

        visited[x][y] = false;
    }
}
