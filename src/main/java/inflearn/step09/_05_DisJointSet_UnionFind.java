package inflearn.step09;

import java.util.Scanner;

/**
 * 1. �� ��ȣ�� �´� �迭�� �����Ѵ�
 * 2. �迭�� �� �׷��� ��ȣ�� �����ο��Ѵ�.
 * 3. ���ο� ģ���� �ξ��������� �׷��ȣ�� �������ش�.
 * 4. �׷��ȣ�� ã�´�.
 *
 * Union : ���׷��� ��ġ�� �������ִ� �޼���
 * find : ���������� ���ε����ϴ� �޼���
 * ���� ��ȣ Ȯ�νÿ� find�� ������ ���ְ� ���غ����Ѵ�.
 */
public class _05_DisJointSet_UnionFind {
    static int[] unf;
    private static void Union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if(fa!=fb) unf[fa]=fb;
    }

    private static int find(int v) {
        if(v==unf[v]) return v;
        else return unf[v]=find(unf[v]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        unf = new int[n+1]; //�ε�����ȣ�� �׳� ���߱� ���� +1��
        for(int i=1; i<=n; i++) unf[i]=i;
        for(int i=1; i<=m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            Union(a,b);
        }
        int fa = find(sc.nextInt());
        int fb = find(sc.nextInt());
        System.out.println(fa==fb ? "YES" : "NO");
    }
}
