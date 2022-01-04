package programmers.level01;

import java.util.HashMap;
import java.util.Map;
/**
 * https://programmers.co.kr/learn/courses/30/lessons/67256
 * 
 * 2020카카오 인턴쉽 키패드 누르기
 *
 */
public class No_09 {
	public static void main(String[] args) {
		No_09 n = new No_09();
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		System.out.println(n.solution(numbers, hand));
	}
	public String solution(int[] numbers, String hand) {
        Map<Integer, Point> map = new HashMap<>();
        map.put(1, new Point(1,1));
        map.put(2, new Point(1,2));
        map.put(3, new Point(1,3));
        map.put(4, new Point(2,1));
        map.put(5, new Point(2,2));
        map.put(6, new Point(2,3));
        map.put(7, new Point(3,1));
        map.put(8, new Point(3,2));
        map.put(9, new Point(3,3));
        map.put(0, new Point(4,2));
        Point left = new Point(4,1);
        Point right = new Point(4,3);
        StringBuilder sb = new StringBuilder();
        for(int x : numbers) {
        	Point p = map.get(x);
        	int a = Math.abs(left.getX()-p.getX())+Math.abs(left.getY()-p.getY());
        	int b = Math.abs(right.getX()-p.getX())+Math.abs(right.getY()-p.getY());
        	if(x==1 || x==4 || x==7) {
        		left = p;
        		sb.append("L");
        	}else if(x==3 || x==6 || x==9) {
        		right = p;
        		sb.append("R");
        	}else if(a<b) {
        		left = p;
        		sb.append("L");
        	}else if(a>b) {
        		right = p;
        		sb.append("R");
        	}else if(hand.equals("left")) {
        		left = p;
        		sb.append("L");
        	}else {
        		right = p;
        		sb.append("R");
        	}
        }
        
        return sb.toString();
    }
	
	class Point{
		int x;
		int y;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}
	}
}
