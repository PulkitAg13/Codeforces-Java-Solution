import java.util.Scanner;

public class Codeforces1788A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }

            int total = 0;
            for(int x : a){
                if(x == 2) total++;
            }

            if(total % 2 != 0){
                System.out.println(-1);
                continue;
            }

            int need = total / 2;
            int cnt = 0;
            int ans = -1;

            for(int i=0;i<n;i++){
                if(a[i] == 2) cnt++;
                if(cnt == need){
                    ans = i + 1;
                    break;
                }
            }

            System.out.println(ans);
        }
    }
}
