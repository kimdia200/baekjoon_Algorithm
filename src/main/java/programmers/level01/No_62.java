package programmers.level01;

//https://school.programmers.co.kr/learn/courses/30/lessons/147355
public class No_62 {
    public static void main(String[] args) {
        System.out.println(new No_62().solution("3141592","271"));
    }

    public int solution(String t, String p) {
        int answer = 0;
        for(int i=0; i<t.length()-p.length()+1; i++){
            String temp = t.substring(i,i+p.length());
            if(temp.compareTo(p)<=0) answer++;
        }
        return answer;
    }
}
