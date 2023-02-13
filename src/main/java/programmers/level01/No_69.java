package programmers.level01;

//https://school.programmers.co.kr/learn/courses/30/lessons/133499
//코딩테스트 연습
//연습문제
//옹알이 (2)
public class No_69 {

    private String[] base = new String[] {"aya", "ye", "woo", "ma" };
    public static void main(String[] args) {
        System.out.println(new No_69().solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));
    }
    public int solution(String[] babbling) {
        int answer = 0;

        for(String s : babbling){
            String last = "";
            for(int i=0; i<base.length; i++){
                if(s.startsWith(base[i]) && !last.equals(base[i])){
                    s=s.substring(base[i].length());
                    last=base[i];
                    i=-1;
                }
            }
            if(s.length()==0) answer++;
        }

        return answer;
    }
}
