package inflearn.step08_DFS_BFS_hard;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _04_my {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }
        Queue<Integer> q = new LinkedList<>();
        dfs(arr, q, m);
    }

    private static void dfs(int[] arr, Queue<Integer> q, int m) {
        if(q.size()==m){
            System.out.println(q);
            return;
        }
        for(int i=0; i<arr.length; i++){
            q.add(arr[i]);
            dfs(arr, q, m);
            q.remove(arr[i]);
        }
    }
}


//문제
//중복순열 구하기
//1부터 N까지 번호가 적힌 구슬이 있습니다.
//이중 중복을 허락받아 M번을 뽑아 일렬로 나열하는 방법을 모두 출력합니다.
//
//입력설명
//첫 번째 줄에 자연수 n(3<=n<=10)과 m(2<=m<=n)이 주어집니다
//
//출력설명
//첫 번째 줄에 결과를 출력합니다.
//출력순서는 사전순으로 오름차순으로 출력합니다.
//
//입력예제 1
//3 2
