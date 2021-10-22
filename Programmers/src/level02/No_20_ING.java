package level02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//2021 카카오블라인드 리쿠르잇- 순위검색
public class No_20_ING {
	public static void main(String[] args) {
		String[] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String[] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
		System.out.println(Arrays.toString(new No_20_ING().solution(info, query)));
	}
	public int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];
        
        List<People> list = new ArrayList<>();
        for(String str : info) {
        	String[] temp = str.split(" ");
        	list.add(new People(temp[0], temp[1], temp[2], temp[3], Integer.parseInt(temp[4])));
        }
        
        for(int i=0; i<query.length; i++) {
        	String str = query[i].replace(" and", "");
        	String[] temp = str.split(" ");
        	People p = new People(temp[0], temp[1], temp[2], temp[3], Integer.parseInt(temp[4]));
        	
        	int cnt=0;
        	for(int j=0; j<list.size(); j++) {
        		if(list.get(j).check(p)) cnt++;
        	}
        	answer[i]=cnt;
        }
        return answer;
    }
	
	class People{
		String lan;
		String kind;
		String career;
		String food;
		int score;
		
		public People(String lan, String kind, String career, String food, int score) {
			super();
			this.lan = lan;
			this.kind = kind;
			this.career = career;
			this.food = food;
			this.score = score;
		}
		public String getLan() {
			return lan;
		}
		public String getKind() {
			return kind;
		}
		public String getCareer() {
			return career;
		}
		public String getFood() {
			return food;
		}
		public int getScore() {
			return score;
		}
		@Override
		public String toString() {
			return "People [lan=" + lan + ", kind=" + kind + ", career=" + career + ", food=" + food + ", score="
					+ score + "]";
		}
		public boolean check(People obj) {
			if(!(obj.getLan().equals("-") || this.lan.equals(obj.getLan())))
				return false;
			if(!(obj.getKind().equals("-") || this.kind.equals(obj.getKind())))
				return false;
			if(!(obj.getCareer().equals("-") || this.career.equals(obj.getCareer())))
				return false;
			if(!(obj.getFood().equals("-") || this.food.equals(obj.getFood())))
				return false;
			if(this.score<obj.getScore())
				return false;
			return true;
		}
	}
}
