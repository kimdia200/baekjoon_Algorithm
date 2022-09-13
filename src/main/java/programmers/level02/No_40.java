package programmers.level02;

import java.util.Arrays;

public class No_40 {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split(" ");
        System.out.println(Arrays.toString(strArr));
        int[] intArr = new int[strArr.length];
        for(int i=0; i<strArr.length; i++){
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        int max = Arrays.stream(intArr).max().getAsInt();
        int min = Arrays.stream(intArr).min().getAsInt();
        StringBuilder sb = new StringBuilder();
        sb.append(min);
        sb.append(" ");
        sb.append(max);
        return sb.toString();
    }
}
