package inflearn.step09;

import java.util.*;

public class _05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(i+1, new HashSet<>());
        }
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            map.get(a).add(b);
            map.get(b).add(a);
        }

        int a = sc.nextInt();
        int b = sc.nextInt();

        Set<Integer> check = new HashSet<>();
        Queue<Integer> q = new LinkedList<>(map.get(a));
        while(!q.isEmpty()){
            int tmp = q.poll();
            if(!check.add(tmp)) continue;
            check.add(tmp);
            q.addAll(map.get(tmp));
        }
        System.out.println(check.contains(b) ? "YES" : "NO");
    }
}
