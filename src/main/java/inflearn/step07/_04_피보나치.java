package inflearn.step07;

import java.util.Date;

//n=45�� ��� ���۽ð� 7.6��
public class _04_�Ǻ���ġ {
    public static void main(String[] args) {
        long a = new Date().getTime();
        _04_�Ǻ���ġ t = new _04_�Ǻ���ġ();
        int n = 45;
        for(int i=1; i<=n; i++) System.out.print(t.dfs(i)+ " ");
        long b = new Date().getTime();
        System.out.println("\n"+(b-a));
    }

    private int dfs(int n) {
        if(n==1) return 1;
        else if(n==2) return 2;
        else return dfs(n-2)+dfs(n-1);
    }
}
