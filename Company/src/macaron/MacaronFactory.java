package macaron;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MacaronFactory {

	public static void main(String[] args) {
		MacaronFactory m = new MacaronFactory();
		
//		1��
//		String p="PM 05:05:05";
//		int n=1;
//		System.out.println(m.solution(p, n));
		
//		2��
//		System.out.println(m.solution(2322));
		
//		3��
//		int[] arr = {4,3,3};
//		System.out.println(m.solution(4, arr));
		
//		4��
		int n = 3;
		int[] nn = {4,2,2,5,3};
		System.out.println(Arrays.toString(m.solution(n,nn)));
		
	}
	public int[] solution(int N, int[] coffee_times) {
    	//�ֹ����� �����
        int[] answer = new int[coffee_times.length];
        
    	//Ŀ�� ���ⱸ N
    	
    	//Ŀ�� ����µ� �ɸ��� �ð� coffee_times
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for(int i=0; i<coffee_times.length; i++) {
    		map.put(i+1, coffee_times[i]);
    	}
    	
    	
    	Iterator<Integer> it = null;
    	
    	int time=0;
    	int i=N+1;
    	int j=0;
    	
    	while(true) {
    		
    		if(map.isEmpty()) {
    			break;
    		}
    		
    		time++;
    		int loop=0;
    		it = map.keySet().iterator();
    		while(it.hasNext() && (loop++<N)) {
    			int key = it.next();
    			int value = map.get(key);
    			if(value == time) {
    				answer[j++]=key;
    				it.remove();
    				if(map.containsKey(i)) {
    					map.put(i, map.get(i++)+time);
    				}
    			}
    		}
    	}
    	System.out.println("�� �ҿ�ð� = " + time + "��");
    	
        return answer;
    }
	
	//3��
//	public int solution(int no, int[] works) {
//        for(int i=0; i<no; i++) {
//        	Arrays.sort(works);
//        	--works[works.length-1];
//        }
//        int sum=0;
//        for(int x : works) {
//        	sum+= x*x;
//        }
//        return sum;
//    }
	//2������
//	public int solution(long n) {
//        
//        int length = String.valueOf(n).length();
//        Set<Integer> set = new HashSet<>();
//
//        for(int i=0; i<length; i++) {
//        	int x=Integer.parseInt(String.valueOf(String.valueOf(n).charAt(i)));
//        	if(x==0) {
//        		continue;
//        	}
//        	if(n%x==0) {
//        		set.add(x);
//        	}
//        }
//        return set.size();
//    }

	//1������
//	public String solution(String p, int n) {
//		//am pm���� �Ǵ�
//		String head = p.substring(0,2);
//		//hour
//		int hour = Integer.parseInt(p.substring(3,5));//p.substring(3,5)
//		//min
//		int min = Integer.parseInt(p.substring(6,8));
//		//sec
//		int sec = Integer.parseInt(p.substring(9));
//		
//		int plusTime = n*1000;
//		if(head.equalsIgnoreCase("PM"))
//			plusTime += 1000*60*60*12;
//		
//		Calendar cal = new GregorianCalendar(0, 0, 0, hour, min, sec);
//		Date date = new Date(cal.getTimeInMillis()+plusTime);
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
//		
//		return sdf.format(date);
//	}
}

