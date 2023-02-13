package programmers.level01;

//https://school.programmers.co.kr/learn/courses/30/lessons/131128
//코딩테스트 연습
//연습문제
//숫자 짝꿍

public class No_67 {
    public static void main(String[] args) {
        System.out.println(new No_67().solution2("5526","1255"));
    }

    public String solution2(String X, String Y){
        int[] arr1 = new int[]{0,0,0,0,0,0,0,0,0,0};
        int[] arr2 = new int[]{0,0,0,0,0,0,0,0,0,0};
        StringBuilder sb = new StringBuilder();
        for(char c : X.toCharArray()){
            arr1[c-48]++;
        }

        for(char c : Y.toCharArray()){
            arr2[c-48]++;
        }

        for(int i=9; i>=0; i--){
            int now = Math.min(arr1[i],arr2[i]);
            if(now==0) continue;
            for(int j=0; j<now; j++){
                sb.append(i);
            }
        }

        if(sb.toString().length()==0){
            return "-1";
        }else if(sb.toString().charAt(0)=='0'){
            return "0";
        }
        return sb.toString();
    }
}
