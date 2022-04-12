package inflearn.step07;

import java.util.Date;

//n=45일 경우 동작시간 7.6초
public class _04_피보나치 {
    public static void main(String[] args) {
        long a = new Date().getTime();
        _04_피보나치 t = new _04_피보나치();
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
