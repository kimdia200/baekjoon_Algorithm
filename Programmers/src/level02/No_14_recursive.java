package level02;

//2020 KAKAO BLIND RECRUITMENT - 괄호 변환
public class No_14_recursive {
	public static void main(String[] args) {
		String[] arr = {"(()())()",")(","()))((()"};
		String[] result = {"(()())()","()","()(())()"};
		for(int i=0;i<arr.length; i++) {
			System.out.println(new No_14_recursive().solution(arr[i]).equals(result[i]));
			System.out.println("===================");
		}
	}
	public String solution(String p) {
		StringBuilder sb = new StringBuilder();
		//1단계
		if(p.length()==0) return sb.toString();
		//2단계
		String u=null;
		String v=null;
		int left=0;
		int right=0;
		for(int i=0; i<p.length(); i++) {
			if(p.charAt(i)=='(') left++;
			else if(p.charAt(i)==')') right++;
			if(left!=0 && left==right) {
				u=p.substring(0,i+1);
				v=p.substring(i+1);
				break;
			}
		}
		//3단계
		if(check(u)) {
			sb.append(u);
			sb.append(solution(v));
		}else {
			sb.append("(");
			sb.append(solution(v));
			sb.append(")");
			for(int i=1; i<u.length()-1;i++) {
				if(u.charAt(i)=='(') sb.append(")");
				if(u.charAt(i)==')') sb.append("(");
			}
		}
		return sb.toString();
    }
	
	private boolean check(String u) {
		int left=0;
		int right=0;
		for(int i=0; i<u.length(); i++) {
			if(u.charAt(i)=='(') left++;
			else if(u.charAt(i)==')') right++;
			if(left<right) return false;
		}
		return true;
	}
}
