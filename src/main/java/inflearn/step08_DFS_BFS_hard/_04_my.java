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


//����
//�ߺ����� ���ϱ�
//1���� N���� ��ȣ�� ���� ������ �ֽ��ϴ�.
//���� �ߺ��� ����޾� M���� �̾� �Ϸķ� �����ϴ� ����� ��� ����մϴ�.
//
//�Է¼���
//ù ��° �ٿ� �ڿ��� n(3<=n<=10)�� m(2<=m<=n)�� �־����ϴ�
//
//��¼���
//ù ��° �ٿ� ����� ����մϴ�.
//��¼����� ���������� ������������ ����մϴ�.
//
//�Է¿��� 1
//3 2
