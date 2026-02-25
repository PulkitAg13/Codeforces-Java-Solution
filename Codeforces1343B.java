import java.util.Scanner;

public class Codeforces1343B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            
            if(n % 4 != 0){
                System.out.println("NO");
            } else {
                System.out.println("YES");
                
                int k = n / 2;
                int sumEven = 0;
                
                for(int i = 1; i <= k; i++){
                    int x = 2 * i;
                    System.out.print(x + " ");
                    sumEven += x;
                }
                
                int sumOdd = 0;
                
                for(int i = 1; i < k; i++){
                    int y = 2 * i - 1;
                    System.out.print(y + " ");
                    sumOdd += y;
                }
                
                System.out.println(sumEven - sumOdd);
            }
        }
    }
}
