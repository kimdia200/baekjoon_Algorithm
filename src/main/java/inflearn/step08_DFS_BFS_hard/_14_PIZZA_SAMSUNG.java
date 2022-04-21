package inflearn.step08_DFS_BFS_hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _14_PIZZA_SAMSUNG {
    static List<int[]> base = new ArrayList<>();
    static List<int[]> comb = new ArrayList<>();
    static int[][] map;
    static int n;
    static int m;
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        //��� 0�� �ǹ̰� ���� 1(��)�� 2(������)�� ��ġ�� ����ϰ� ��ǥ ��� �ϸ� �Ǳ� ������
        //2���� �迭�� ������ �ʿ䵵 ����δ�.
        map = new int[n][n];
        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[i].length; j++){
                int input = sc.nextInt();
                if(input==1 || input==0) map[i][j]=input;
                else base.add(new int[]{i,j});
            }
        }

        dfs(0);

        System.out.println(answer);
    }

    private static void dfs(int start) {
        if(comb.size()==m){
            min(comb);
            return;
        }
        for(int i=start; i<base.size(); i++){
            comb.add(base.remove(i));
            dfs(i);
            base.add(i,comb.remove(comb.size()-1));
        }
    }

    private static void min(List<int[]> comb) {
        int sum=0;
        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[i].length; j++){
                if(map[i][j]!=1) continue;
                int min = Integer.MAX_VALUE;
                for(int[] x : comb){
                    min=Math.min(min, Math.abs(i-x[0])+Math.abs(j-x[1]));
                }
                sum+=min;
            }
        }
        answer = Math.min(answer, sum);
    }
}
