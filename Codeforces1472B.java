import java.util.Scanner;

public class Codeforces1472B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            int cnt1 = 0;
            int cnt2 = 0;
            
            for(int i = 0; i < n; i++){
                int x = sc.nextInt();
                if(x == 1) cnt1++;
                else cnt2++;
            }
            
            int sum = cnt1 + 2 * cnt2;
            
            if(sum % 2 != 0){
                System.out.println("NO");
            } 
            else if(cnt1 == 0 && cnt2 % 2 == 1){
                System.out.println("NO");
            } 
            else{
                System.out.println("YES");
            }
        }
    }
}
