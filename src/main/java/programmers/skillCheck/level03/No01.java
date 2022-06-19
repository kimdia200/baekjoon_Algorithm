package programmers.skillCheck.level03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class No01 {
    public static void main(String[] args) {
        int[][] routes =  {{-20,-15}, {-14,-5}, {-15,-13}, {-5,-3}};
        System.out.println(new No01().solution(routes));
    }

    public int solution(int[][] routes) {
        int answer = 0;

        List<int[]> list = new ArrayList<>();
        for(int i=0; i<routes.length; i++){
            list.add(new int[]{routes[i][0],routes[i][1]});
        }

        list.sort(getComparator());
        answer = getCameraCNT(list);

        //임시 출력
        for (int[] ints : list) {
            System.out.println(Arrays.toString(ints));
        }
        return answer;
    }
    public int getCameraCNT(List<int[]> list){
        int answer = 0;
        int last = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            int[] now = list.get(i);
            if(i==0){
                last=now[1];
                continue;
            }
            //보다 큰수가 들어올때
            if(last<now[0]){
                answer++;
                last=now[1];
                continue;
            }
            //작거나 같은값이 들어와서 계속 진행 할때
            if(i==list.size()-1){
                answer++;
            }
        }
        return answer;
    }
    public Comparator<int[]> getComparator(){
        return new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]!=o2[0])
                    return o1[1]-o2[1];
                return o1[0]-o2[0];
            }
        };
    }
}