package inflearn.step08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Integer max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int n = sc.nextInt();
        List<Integer> base = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            base.add(sc.nextInt());
        }
        
    }
}