package programmers.level01;

import java.text.DecimalFormat;
import java.util.*;

//https://school.programmers.co.kr/learn/courses/30/lessons/150370#
//코딩테스트 연습
//2023 KAKAO BLIND RECRUITMENT
//개인정보 수집 유효기간
public class No_75 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new No_75().solution("2021.12.08",new String[]{"A 18"}, new String[]{"2022.06.08 A"})));
    }

    public int[] solution(String today, String[] terms, String[] privacies) {
        List<String> list = new ArrayList<>();
        today = today.replaceAll("[.]","");
        Map<String, Integer> term = new HashMap<>();
        for(String s : terms){
            String[] temp = s.split(" ");
            term.put(temp[0], Integer.parseInt(temp[1]));
        }
        for(String s : privacies){
            String[] temp = s.split(" ");
            String t = temp[1];
            temp = temp[0].split("[.]");
            int y = Integer.parseInt(temp[0]);
            int m = Integer.parseInt(temp[1]);
            int d = Integer.parseInt(temp[2])-1;
            if(d==0) {
                d=28;
                m--;
            }
            m+=term.get(t);
            while(m>12){
                m-=12;
                y++;
            }
            DecimalFormat df = new DecimalFormat("00");
            StringBuilder sb = new StringBuilder();
            sb.append(df.format(y)).append(df.format(m)).append(df.format(d));
            list.add(sb.toString());
        }
        System.out.println(list);
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            if(today.compareTo(list.get(i))>0) result.add(i+1);
        }
        return result.stream().mapToInt(i->i).toArray();
    }
}
