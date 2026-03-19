import java.util.Scanner;

public class Codeforces1853A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }

            boolean ok = false;

            for(int i=0;i<n-1;i++){
                if(a[i] > a[i+1]){
                    ok = true;
                }
            }

            if(ok){
                System.out.println(0);
                continue;
            }

            int ans = Integer.MAX_VALUE;

            for(int i=0;i<n-1;i++){
                int d = a[i+1] - a[i];
                int x = d/2 + 1;
                ans = Math.min(ans, x);
            }

            System.out.println(ans);
        }
    }
}
