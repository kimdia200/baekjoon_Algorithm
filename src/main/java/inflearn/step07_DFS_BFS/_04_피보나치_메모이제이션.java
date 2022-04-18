package inflearn.step07_DFS_BFS;

import java.util.Date;

//n=45�� ��� ���۽ð� 0.02��
//�޸������̼�(Memoization)
//�޸������̼��� ��ǻ�� ���α׷��� ������ ����� �ݺ��ؾ� �� ��,
//������ ����� ���� �޸𸮿� ���������ν� ������ ����� �ݺ� ������ �����Ͽ� ���α׷� ���� �ӵ��� ������ �ϴ� ����̴�.
//���� ��ȹ���� �ٽ��� �Ǵ� ����̴�. �޸������̼��̶�� �Ѵ�.
public class _04_�Ǻ���ġ_�޸������̼� {
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
