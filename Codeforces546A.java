import java.util.Scanner;

public class Codeforces546A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int money = 0;
        for(int i = 1; i <= w; i++){
            n = n - k * i;
        }
        if(n < 0){
            money = money - n;
        }
        System.out.println(money);
    }
}
