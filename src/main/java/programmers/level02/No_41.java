package programmers.level02;

//https://school.programmers.co.kr/learn/courses/30/lessons/12951
//JadenCase 문자열 만들기

public class No_41 {
    public static void main(String[] args) {
        String s = "3people unFollowed me";
        System.out.println(new No_41().solution(s));
    }
    public String solution(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            if(i==0 || arr[i-1]==' '){
                sb.append(upper(arr[i]));
            }else{
                sb.append(lower(arr[i]));
            }
        }
        return sb.toString();
    }
    public char upper(char c){
        if(!Character.isAlphabetic(c)) return c;
        else return Character.toUpperCase(c);
    }
    public char lower(char c){
        if(!Character.isAlphabetic(c)) return c;
        else return Character.toLowerCase(c);
    }
}
