package inflearn.step09;

import java.util.Scanner;

/**
 * 1. 각 번호에 맞는 배열을 생성한다
 * 2. 배열에 각 그룹의 번호를 지정부여한다.
 * 3. 새로운 친구가 맺어질때마다 그룹번호를 갱신해준다.
 * 4. 그룹번호를 찾는다.
 *
 * Union : 각그룹의 위치를 갱신해주는 메서드
 * find : 실질적으로 내부동작하는 메서드
 * 최종 번호 확인시에 find로 갱신을 해주고 비교해봐야한다.
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
        unf = new int[n+1]; //인덱스번호랑 그냥 맞추기 위해 +1함
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
