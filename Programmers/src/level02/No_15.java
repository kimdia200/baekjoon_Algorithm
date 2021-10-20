package level02;

public class No_15 {
	public static void main(String[] args) {
		System.out.println(new No_15().solution("[](){}"));
	}
	public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        for(int i=0; i<s.length();i++) {
        	if(check(sb.toString())) answer++;
        	sb.deleteCharAt(0);
        	sb.append(s.charAt(i));
        }
        return answer;
    }
	private boolean check(String s) {
		while(true) {
			String temp = s.replace("[]", "").replace("{}", "").replace("()", "");
			if(temp.equals(s)) break;
			else s=temp;
		}
		if(s.length()==0) return true;
		return false;
	}
}
