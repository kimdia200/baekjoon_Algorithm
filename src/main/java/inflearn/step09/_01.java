package inflearn.step09;

import java.util.Scanner;

public class _01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Player[] arr = new Player[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = new Player(sc.nextInt(), sc.nextInt());
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(i==j) continue;
                if(arr[i].isOut(arr[j])){
                    n--;
                    break;
                }
            }
        }
        System.out.println(n);
    }
}
class Player{
    int height;
    int weight;

    public Player(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }
    public boolean isOut(Player other){
        boolean rt = false;
        if(this.height<other.height && this.weight < other.weight){
            System.out.println(this.height + " " +this.weight + " < " + other.height + " " + other.weight);
            rt = true;
        }
        return rt;
    }
}
