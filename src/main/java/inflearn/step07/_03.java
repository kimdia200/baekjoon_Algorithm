package inflearn.step07;

public class _03 {
    //ÆÑÅä¸®¾ó
    public static void main(String[] args) {
        int n=5;
        System.out.println(new _03().dfs(n));
    }

    private int dfs(int n) {
        if(n==1) return 1;
        return n*dfs(n-1);
    }
}
