import java.util.Scanner;

public class Codeforces1900A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            
            int i = 0;
            int ans = 0;
            
            while(i < n){
                if(s.charAt(i) == '.'){
                    int len = 0;
                    while(i < n && s.charAt(i) == '.'){
                        len++;
                        i++;
                    }
                    
                    if(len == 1) ans += 1;
                    else if(len == 2) ans += 2;
                    else ans += 2;
                } else {
                    i++;
                }
            }
            
            System.out.println(ans);
        }
    }
}
