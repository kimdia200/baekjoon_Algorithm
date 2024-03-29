package programmers.level01;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12925
 *
 * 尻柔庚薦 - 庚切伸聖 舛呪稽 郊荷奄
 * 
 * 繕闇聖 左檎 益撹 軒渡 団亀 鞠澗汽 更廃暗遭
 */
public class No_31 {
	public static void main(String[] args) {
		System.out.println(new No_31().solution("+1234"));
	}
	
	public int solution(String s) {
        int answer = 0;
        boolean minus = false;
        s = s.replace("+", "");
        if(s.contains("-")) {
        	s = s.replace("-", "");
        	minus = true;
        }
        answer = Integer.parseInt(s);
        if(minus) {
        	answer*=(-1);
        }
        return answer;
    }
	
	//焼 益撹 戚係惟 馬檎 鞠澗汽 せせせせせせ
	public int solution0(String s) {
		return Integer.parseInt(s);
	}
}
