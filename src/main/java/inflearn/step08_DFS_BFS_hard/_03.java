package inflearn.step08_DFS_BFS_hard;

import java.util.Scanner;

public class _03 {
    static int maxPoint;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int limit = sc.nextInt();

        Question[] arr = new Question[num];
        for (int i=0; i<arr.length; i++){
            arr[i] = new Question(sc.nextInt(), sc.nextInt());
        }

        int idx=0;
        int time=0;
        int sum=0;
        dfs(arr, idx, sum, time, limit);

        System.out.println(maxPoint);
    }

    private static void dfs(Question[] arr, int idx, int sum, int time, int limit) {
        if(time>limit) return;
        if(idx==arr.length){
            maxPoint = Math.max(maxPoint, sum);
            return;
        }
        dfs(arr, idx+1, sum+arr[idx].point, time+arr[idx].time, limit);
        dfs(arr, idx+1, sum, time, limit);
    }
}
class Question{
    int point;
    int time;

    public Question(int point, int time){
        this.point = point;
        this.time = time;
    }
}
