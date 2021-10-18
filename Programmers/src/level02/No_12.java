package level02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No_12 {
	public static void main(String[] args) {
		String[][] places = {
				{
					"POOOP", 
					"OXXOX", 
					"OPXPX", 
					"OOXOX", 
					"POXXP"}, 
				{
					"POOPX", 
					"OXPXP", 
					"PXXXO", 
					"OXXXO", 
					"OOOPP"}, 
				{
					"PXOPX", 
					"OXOXP", 
					"OXPOX", 
					"OXXOP", //0 3  14    03    /0 4 / 13
					"PXPOX"}, 
				{
					"OOOXX", 
					"XOOOX", 
					"OOOXX", 
					"OXOOX", 
					"OOOOO"}, 
				{
					"PXPXP", 
					"XPXPX", 
					"PXPXP", 
					"XPXPX", 
					"PXPXP"}};
		System.out.println(Arrays.toString(new No_12().solution(places)));
	}
	
	public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        
        for(int i=0; i<places.length; i++) {
        	System.out.println("==========="+i+"========");
        	answer[i] = check(places[i]);
        }
        return answer;
    }

	private int check(String[] arr) {
		List<Point> list = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length(); j++) {
				char c = arr[i].charAt(j);
				if(c=='P') {
					list.add(new Point(i, j));
				}
			}
		}
		for(int i=0; i<list.size(); i++) {
			Point p1 = list.get(i);
			for(int j=i+1; j<list.size(); j++) {
				Point p2 = list.get(j);
				int distance = Math.abs(p1.getX()-p2.getX())+Math.abs(p1.getY()-p2.getY());
				if(distance==1) return 0;
				if(distance<=2) {
					if(p1.getX()==p2.getX()) {
						if(arr[p1.getX()].charAt(Math.min(p1.getY(), p2.getY())+1)!='X') {
							return 0;
						}
					}else if(p1.getY()==p2.getY()) {
						if (arr[Math.min(p1.getX(), p2.getX()) + 1].charAt(p1.getY()) != 'X') {
							return 0;
						}
					}else {
						//00 11 01 10      
							//우하향= minmax   maxmin
						//11 20 10 21		
							//우상향 = minmin maxmax
						if(p1.getY()<p2.getY()) {
							if (arr[p1.getX()].charAt(p2.getY()) != 'X') {
								return 0;
							}else if(arr[p2.getX()].charAt(p1.getY())!='X'){
								return 0;
							}
						}
					}
				}
			}
		}
		return 1;
	}
	
	class Point{
		int x;
		int y;
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		@Override
		public String toString() {
			return "[x=" + x + ", y=" + y + "]";
		}
		
	}
}
