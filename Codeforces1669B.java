import java.util.Scanner;

public class Codeforces1669B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] f = new int[n+1];
            int ans = -1;

            for(int i=0;i<n;i++){
                int x = sc.nextInt();
                f[x]++;
                if(f[x] >= 3 && ans == -1){
                    ans = x;
                }
            }

            System.out.println(ans);
        }
    }
}
