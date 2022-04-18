package inflearn.step07_DFS_BFS;

public class _02 {
    //이진수로 변환 하여 출력하기
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
