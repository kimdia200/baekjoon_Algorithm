package inflearn.step08_DFS_BFS_hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        List<Integer> base = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<n; i++){
            base.add(sc.nextInt());
        }
        dfs(base, result, c);
    }

    private static void dfs(List<Integer> base, List<Integer> result, int c) {
        if(result.size()==c){
            System.out.println(result);
            return;
        }
        for(int i=0; i<base.size(); i++){
            result.add(base.remove(i));
            dfs(base, result, c);
            base.add(i, result.remove(result.size()-1));
        }
    }
}

//��¼���
//ù ��° �ٿ� ����� ����մϴ�.
//��¼����� ���������� ������������ ����մϴ�.
//
//
//�Է¿���
//3 2
//3 6 9
//
//��¿���
//3 6
//3 9
//6 3
//6 9
//9 3
//9 6