package programmers.level02;

public class No_45 {
    public static void main(String[] args) {
        System.out.println(new No_45().solution(3));
    }
    int[] arr;
    public int solution(int n) {
        arr = new int[n+1];
        return dfs(n);
    }
    public int dfs(int n){
        if(arr[n]>0) return arr[n];
        if(n==0) return arr[n]=0;
        if(n==1) return arr[n]=1;
        int result = dfs(n-1) + dfs(n-2);
        return arr[n] = result%1234567;
    }
}
