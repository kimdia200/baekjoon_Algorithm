package programmers.level02;

import java.util.ArrayList;
import java.util.List;

//2017카카오코드 본선 - 단체사진찍기
public class No_04_NotSolved {
	static int cnt;
	
	public static void main(String[] args) {
		int n = 2;
		String[] data = {"N~F=0", "R~T>2"};
		System.out.println(new No_04_NotSolved().solution(n, data));
	}
	
	public int solution(int n, String[] data) {
        List<String> base = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        //A, C, F, J, M, N, R, T
        base.add("A");
        base.add("C");
        base.add("F");
        base.add("J");
        base.add("M");
        base.add("N");
        base.add("R");
        base.add("T");
        
        recur(data,base,temp);
        return cnt;
    }
	
	private void recur(String[] data,List<String> base, List<String> temp) {
		if(base.size()==0) {
			StringBuilder sb = new StringBuilder();
			for(String s : temp) {
				sb.append(s);
			}
			if(check(data,sb.toString())) cnt++;
			return;
		}
		
		for(int i=0; i<base.size(); i++) {
			temp.add(base.remove(i));
			recur(data,base, temp);
			base.add(i,temp.remove(temp.size()-1));
		}
	}

	public boolean check(String[] data, String s) {
		for(int i=0; i<data.length; i++) {
        	String[] temp = data[i].split("");
        	String c1 = temp[0];
        	String c2 = temp[2];
        	String opr = temp[3];
        	int num = Integer.parseInt(temp[4]);
        	
        	int distance = Math.abs(s.indexOf(c1)-s.indexOf(c2))-1;
        	
        	if(opr.equals("=")) {
        		if(distance!=num) {
        			return false;
        		}
        	}else if(opr.equals(">")) {
        		if(distance<=num) {
        			return false;
        		}
        	}else if(opr.equals("<")) {
        		if(distance>=num) {
        			return false;
        		}
        	}
		}
		return true;
	}
}
