import java.util.*;   
public class Codeforces158A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        int pass_score = 1;
        for (int i = 1; i <= n; i++) {
            int score = sc.nextInt();
            if(score >= pass_score){
                count++;
            }
            if(i == k){
                pass_score = score;
                if(pass_score <= 0){
                    break;
                }
            }
        }
        System.out.println(count);
    }
}