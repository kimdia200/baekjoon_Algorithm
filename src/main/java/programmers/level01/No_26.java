package programmers.level01;
/**
 * https://programmers.co.kr/learn/courses/30/lessons/12918
 * 
 * �������� - ���ڿ� �ٷ�� �⺻
 *
 */
public class No_26 {
	public static void main(String[] args) {
		System.out.println(new No_26().solution2("1234"));
	}
	
	public boolean solution(String s) {
        boolean answer = false;
        
        if(s.length()==4 || s.length()==6) {
        	for(int i=0; i<s.length(); i++) {
        		if(s.charAt(i)<'0' || s.charAt(i)>'9') {
        			break;
        		}
        		if(i==s.length()-1) answer=true;
        	}
        }
        
        return answer;
    }
	
	/**
	 * �ٸ���� Ǯ�� try catch�� Ȱ���ؼ� ������ ��� ���....
	 */
	public boolean solution2(String s) {
		
		try {
			if(s.length()!=4 && s.length() != 6) throw new NumberFormatException();
			int x = Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
}
