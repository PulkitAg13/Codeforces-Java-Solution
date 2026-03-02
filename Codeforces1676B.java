import java.util.Scanner;

public class Codeforces1676B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            long sum = 0;
            int min = Integer.MAX_VALUE;
            
            for(int i = 0; i < n; i++){
                int x = sc.nextInt();
                sum += x;
                min = Math.min(min, x);
            }
            
            System.out.println(sum - (long)n * min);
        }
    }
}
