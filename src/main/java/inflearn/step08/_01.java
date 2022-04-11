package inflearn.step08;

import java.util.*;

public class _01 {
    static boolean flag = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0; i<n; i++){
            list1.add(sc.nextInt());
        }
        for(int i=1; i<n; i++){
            dfs(list1, list2, 0, i);
        }
        if(flag) System.out.println("YES");
        else System.out.println("NO");
    }

    private static void dfs(List<Integer> list1, List<Integer> list2, int start, int cnt) {
        if(flag) return;
        if(cnt==0){
            int sum1 = list1.stream().mapToInt(i->i).sum();
            int sum2 = list2.stream().mapToInt(i->i).sum();
            if(sum1==sum2){
                flag=true;
                return;
            }
        }
        for(int i=start; i<list1.size(); i++){
            list2.add(list1.remove(i));
            dfs(list1,list2,i,cnt-1);
            list1.add(i,list2.remove(list2.size()-1));
        }
    }
}
