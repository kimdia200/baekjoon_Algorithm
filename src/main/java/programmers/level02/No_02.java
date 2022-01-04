package programmers.level02;

//���ڿ� ����
public class No_02 {
	public static void main(String[] args) {
		String s = "aabbaccc";
		int result = new No_02().solution(s);
		System.out.println(result);
	}

	private int solution(String s) {
		int answer = s.length();

		for(int i=1; i<= s.length()/2; i++) {
			int len = compression(s, i).length();
			answer = Math.min(answer, len);
		}
		
		return answer;
	}

	private String compression(String s, int i) {
		int cnt = 1;
		String compression = "";
		String pattern = "";
		for(int j=0; j<s.length()+i; j+=i) {
			String nowStr;
			//���繮�ڿ� ����
			if(j>s.length()) {
				nowStr = "";
			}else if(j+i<=s.length()) {
				nowStr = s.substring(j,j+i);
			}else {
				nowStr = s.substring(j);
			}
			
			if(nowStr.equals(pattern)) {
				cnt++;
			}else { //���ڿ� �ٸ�
				compression += (cnt>1 ? cnt : "") + nowStr;
				cnt = 1;
				pattern = nowStr;
			}
			
			if(j+i > s.length()) break;
		}
		return compression;
	}
}
