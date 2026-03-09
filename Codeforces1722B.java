import java.util.Scanner;

public class Codeforces1722B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            String a = sc.next();
            String b = sc.next();
 
            a = a.replace('B','G');
            b = b.replace('B','G');
 
            if(a.equals(b)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
