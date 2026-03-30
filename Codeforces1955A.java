import java.util.Scanner;

public class Codeforces1955A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(2*a <= b){
                System.out.println(n * a);
            }else{
                int pairs = n / 2;
                int rem = n % 2;
                System.out.println(pairs * b + rem * a);
            }
        }
    }
}
