package inflearn.step07_DFS_BFS;

public class _02 {
    //�������� ��ȯ �Ͽ� ����ϱ�
    public static void main(String[] args) {
        int n = 8;
        new _02().dfs(n);
    }

    private void dfs(int n) {
        if(n==0) return;
        dfs(n/2);
        System.out.print(n%2);
    }
}
