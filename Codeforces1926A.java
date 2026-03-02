import java.util.Scanner;

public class Codeforces1926A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            int a = 0;
            int b = 0;
            
            for(int i = 0; i < 5; i++){
                if(s.charAt(i) == 'A'){
                    a++;
                } else {
                    b++;
                }
            }
            
            if(a > b){
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
    }
}
