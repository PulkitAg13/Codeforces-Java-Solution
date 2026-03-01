import java.util.Scanner;

public class Codeforces429A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = 0;
        int need = 0;
        
        while(true){
            int x = (h + 1) * (h + 2) / 2;
            if(need + x > n) break;
            need += x;
            h++;
        }
        
        System.out.println(h);
    }
}
