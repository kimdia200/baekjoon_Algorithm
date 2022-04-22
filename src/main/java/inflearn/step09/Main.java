package inflearn.step09;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Meeting[] arr = new Meeting[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = new Meeting(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(arr);

        int answer = 0;
        for(int i=0; i<arr.length; i++){
            answer = Math.max(answer, bfs(arr, i));
        }
        System.out.println("===========================");
        System.out.println(answer);
    }

    private static int bfs(Meeting[] arr, int start) {
        int[] visit = new int[arr.length];
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visit[start]=1;
        System.out.println("---------------------------------------------");
        while(!q.isEmpty()){
            int now = q.poll();
            for(int i=now+1; i<arr.length; i++){
                if(!(arr[now].end<=arr[i].start)) continue;
                if(visit[i]<=visit[now]+1){
                    visit[i]=visit[now]+1;
                    q.add(i);
                }
            }
        }
        System.out.println(Arrays.toString(visit));
        return Arrays.stream(visit).max().getAsInt();
    }
}
class Meeting implements Comparable<Meeting>{
    int start;
    int end;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Meeting o) {
        if(this.start!=o.start)
            return this.start-o.start;
        else
            return this.end-o.end;
    }
}