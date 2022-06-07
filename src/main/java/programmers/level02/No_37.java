package programmers.level02;

import java.util.Arrays;
import java.util.Scanner;

//https://programmers.co.kr/learn/courses/30/lessons/70129
//이진변환 반복하기
public class No_37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        System.out.println(Arrays.toString(new No_37().solution(x)));
    }

    public int[] bestSolution(String s){
        int[] answer = new int[2];

        while(!s.equals("1")){
            answer[0]++;
            int temp = s.length();
            s = s.replaceAll("0","");
            answer[1] += temp-s.length();
            s = Integer.toBinaryString(s.length());
        }

        return answer;
    }

    public int[] solution(String s){
        int[] answer = new int[2];
        while(!s.equals("1")){
            answer[0]++;
            answer[1] += zeroCNT(s);
            s = String.valueOf(Integer.toBinaryString(s.replaceAll("0","").length()));
        }
        return answer;
    }

    private static int zeroCNT(String x) {
        int zeroCNT = 0;
        for(char c : x.toCharArray()){
            if(c=='0') zeroCNT++;
        }
        return zeroCNT;
    }
}
