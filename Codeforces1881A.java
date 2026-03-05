import java.util.Scanner;

public class Codeforces1881A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            String x = sc.next();
            String s = sc.next();

            int count = 0;

            while(x.length() <= 2*m){
                if(x.contains(s)){
                    System.out.println(count);
                    break;
                }
                x = x + x;
                count++;
            }

            if(!x.contains(s)){
                System.out.println(-1);
            }
        }
    }
}
