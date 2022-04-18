package inflearn.step08_DFS_BFS_hard;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _02 {
    //���� ��ȿ�� �ϻ縦 �ϴ°���̹Ƿ�
    //1,2,3,4,5  === 5,4,3,2,1 == 3,1,2,4,5 ��� �Ȱ����Ƿ� �ѹ��� �����ϵ��� ���� �ϸ� �����ð��� ª������.
    public static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ){
            String[] temp = br.readLine().split(" ");
            int limit = Integer.parseInt(temp[0]);
            int n = Integer.parseInt(temp[1]);
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(br.readLine());
            }
            dfs(arr, limit, 0,0);
            System.out.println(max);
        }catch (Exception e){
            System.out.println("error");
        }
    }

    private static void dfs(int[] arr, int limit, int sum, int idx) {
        if(sum>limit) return;
        if(idx==arr.length) {
            max = Math.max(max, sum);
            return;
        }
        dfs(arr, limit, sum+arr[idx], idx+1);
        dfs(arr, limit, sum, idx+1);
    }
}