package inflearn.step07;

public class _01 {

    //재귀를 언제 호출하냐에 따라 결과가 달라짐
    public static void main(String[] args) {
        System.out.println("dfs1=============================");
        new _01().dfs1(10);
        System.out.println();
        System.out.println("dfs2=============================");
        new _01().dfs2(10);
    }

    private void dfs1(int i) {
        if(i==0) return;
        System.out.print(i+" ");
        dfs1(i-1);
    }
    private void dfs2(int i) {
        if(i==0) return;
        dfs2(i-1);
        System.out.print(i+" ");
    }
}
