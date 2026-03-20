import java.util.Scanner;

public class Codeforces1915C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            long sum = 0;

            for(int i=0;i<n;i++){
                sum += sc.nextInt();
            }

            long x = (long)Math.sqrt(sum);

            if(x * x == sum){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
