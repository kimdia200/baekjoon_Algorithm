package inflearn.step07_DFS_BFS;

import java.util.Date;

//n=45일 경우 동작시간 0.02초
//메모이제이션(Memoization)
//메모이제이션은 컴퓨터 프로그램이 동일한 계산을 반복해야 할 때,
//이전에 계산한 값을 메모리에 저장함으로써 동일한 계산의 반복 수행을 제거하여 프로그램 실행 속도를 빠르게 하는 기술이다.
//동적 계획법의 핵심이 되는 기술이다. 메모이제이션이라고도 한다.
public class _04_피보나치_메모이제이션 {
    static int[] arr;
    public static void main(String[] args) {
        long a = new Date().getTime();
        int n = 45;
        arr=new int[n+1];
        dfs(45);
        for(int i=1; i<=n; i++){
            System.out.print(arr[i]+" ");
        }
        long b = new Date().getTime();
        System.out.println("\n"+(b-a));
    }

    private static int dfs(int n) {
        if(arr[n]>0) return arr[n];
        if(n==1 || n==2) return arr[n]=1;
        return arr[n]=dfs(n-2)+dfs(n-1);
    }
}
