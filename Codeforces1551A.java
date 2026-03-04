import java.util.Scanner;

public class Codeforces1551A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            long n = sc.nextLong();
            
            long c2 = n / 3;
            long c1 = n - 2 * c2;
            
            if(n % 3 == 2){
                c2++;
                c1 = n - 2 * c2;
            }
            
            System.out.println(c1 + " " + c2);
        }
    }
}
