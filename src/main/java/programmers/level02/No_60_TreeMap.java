package programmers.level02;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

//https://school.programmers.co.kr/learn/courses/30/lessons/92341
//코딩테스트 연습
//2022 KAKAO BLIND RECRUITMENT
//주차 요금 계산
public class No_60_TreeMap {
    public static void main(String[] args) throws Exception {
        int[] fees = new int[] {180, 5000, 10, 600};
        String[] records = new String[] {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
//		int[] fees = new int[] {1, 461, 1, 10};
//		String[] records = new String[] {"00:00 1234 IN"};
        System.out.println(Arrays.toString(new Solution().solution(fees, records)));
    }

}
class Solution {
    public int[] solution(int[] fees, String[] records) {
        int[] answer = {};

        //1. input값 treeMap에 저장
        Map<String, Integer> map = new TreeMap<String, Integer>();
        for(String s : records) {
            String[] record = s.split("[ ]");
            int time = chgMin(record[0],record[2]);
            map.put(record[1], map.getOrDefault(record[1], 0)+time);
        }
        int maxTime = 1439;
        answer=new int[map.size()];
        int idx=0;
        for(String key : map.keySet()) {
            int time = map.get(key);
            //2. 출차 기록이 없는경우(누적시간 음수)에는 23:59분 출차로 기록
            if(time<=0) time+=maxTime;
            //3. 요금 계산
            map.put(key, calcPay(time, fees));
            //4. answer 입력
            answer[idx++] = map.get(key);
        }
        return answer;
    }
    public int chgMin(String time, String option) {
        String[] times = time.split("[:]");
        if(option.equals("IN")) {
            return (-1)*(Integer.parseInt(times[0])*60+Integer.parseInt(times[1]));
        }else {
            return Integer.parseInt(times[0])*60+Integer.parseInt(times[1]);
        }
    }
    public int calcPay(int min, int[] fees) {
        //기본요금 + (사용시간-기본요금시간, 올림처리) / 단위시간 * 시간당요금
        int plusTime = min-fees[0] <=0 ? 0 : min-fees[0];
        return fees[1]+(int)Math.ceil((double)plusTime/fees[2])*fees[3];
    }
}