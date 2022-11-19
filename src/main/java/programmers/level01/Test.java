//https://school.programmers.co.kr/learn/courses/30/lessons/120812?language=java

package programmers.level01;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        System.out.println(new Test().solution(new int[]{1,2,3,4,4}));
    }
    public int solution(int[] array) {
        List<Num> list = new ArrayList<>();
        for(int i=0; i<array.length; i++){
            Num n = new Num(array[i]);
            if(n!=null && list.contains(n)){
                list.get(list.indexOf(n)).countUp();
            }else{
                n.countUp();
                list.add(n);
            }
        }

        list.sort(null);
        System.out.println("list = "+list);
        if(list.get(0).getCount()==list.get(1).getCount())
            return -1;
        else
            return list.get(0).getValue();
    }
}
class Num implements Comparable<Num> {
    private int value;
    private int count;

    public Num(int value){
        this.value = value;
    }

    public void countUp(){
        this.count++;
    }
    public int getCount() {
        return count;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Num num = (Num) o;
        return value == num.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public int compareTo(Num o) {
        return o.getCount()-this.getCount();
    }

    @Override
    public String toString() {
        return value + " " + count;
    }
}
