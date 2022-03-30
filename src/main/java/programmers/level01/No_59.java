package programmers.level01;

public class No_59 {
    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};

        System.out.println(solution(skill,skill_trees));
    }

    private static int solution(String skill, String[] skill_trees) {
        int result = 0;
        String regex = String.format("[^%s]",skill);
        for(String s : skill_trees){
            s=s.replaceAll(regex,"");
            System.out.println(s);
            if(s.length()==0 || skill.substring(0,s.length()).equals(s)){
                result++;
            }
        }
        return result;
    }
}
