import java.util.Scanner;

public class Codeforces707A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        boolean ok = true;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                String s = sc.next();
                if(s.equals("C") || s.equals("M") || s.equals("Y")){
                    ok = false;
                }
            }
        }

        if(ok){
            System.out.println("#Black&White");
        }else{
            System.out.println("#Color");
        }
    }
}
