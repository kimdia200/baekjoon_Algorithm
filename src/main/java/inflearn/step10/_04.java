package inflearn.step10;

import java.util.Arrays;
import java.util.Scanner;

public class _04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Brick[] arr = new Brick[n];
        int[] dy = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = new Brick(sc.nextInt(),sc.nextInt(),sc.nextInt());
        }
        Arrays.sort(arr);

        for(int i=0; i<n; i++){
            int max = arr[i].height;
            for(int j=i-1; j>=0; j--){
                if(arr[i].upCheck(arr[j])){
                    max = Math.max(max, dy[j]+arr[i].height);
                }
            }
            dy[i] = max;
        }
        System.out.println(Arrays.stream(dy).max().getAsInt());
    }
}

class Brick implements Comparable<Brick>{
    int area;
    int height;
    int weight;

    public Brick(int a, int h, int w){
        area = a;
        height = h;
        weight = w;
    }


    @Override
    public int compareTo(Brick o) {
        if(this.area != o.area){
            return o.area - this.area;
        }else{
            return o.weight - this.weight;
        }
    }

    public boolean upCheck(Brick o){
        if(this.area < o.area && this.weight < o.weight){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return area + " "+ height +" " + weight;
    }
}
