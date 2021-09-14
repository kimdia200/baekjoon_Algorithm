package Step05;

import java.util.Scanner;
import java.util.Stack;

//쇠막대기 컷팅
public class _05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(new _05().solution(str));
	}
	
	//시간복잡도상으로 유리함
	public int solution(String str) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();

		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='(') stack.add(str.charAt(i));
			else {
				stack.pop();
				if(str.charAt(i-1)=='(') {
					answer += stack.size();
				}else {
					answer++;
				}
			}
		}
		return answer;
	}
	
	
	//내가푼거
	public int solution0(String str) {
		int answer = 0;
		str = str.replace("()", "C");
		char[] arr = str.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!='(') continue;
			
			int cnt=0;
			int end=1;
			for(int j=i+1;j<arr.length; j++) {
				if(arr[j]=='(') end++;
				else if(arr[j]==')') end--;
				else if(arr[j]=='C') cnt++;
				
				if(end==0) {
					answer += cnt+1;
					break;
				}
			}
		}
		return answer;
	}
}
