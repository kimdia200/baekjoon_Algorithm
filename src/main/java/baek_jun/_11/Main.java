package baek_jun._11;

import java.io.*;
import java.util.Scanner;

//백준 - 그리디 - 설탕배달 -문제번호 2839번
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kg = sc.nextInt();
        System.out.println(new Main().solution(kg));
    }
    public int solution(int kg){
        int answer = -1;

        int five  = kg/5;
        int thr;
        while(five>=0) {
            thr = (kg - (5 * five)) / 3;
            if (((five * 5) + (thr * 3)) == kg) {
                answer = five + thr;
                break;
            }
            five--;
        }
        return answer;
    }
}
