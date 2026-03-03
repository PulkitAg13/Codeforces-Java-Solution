import java.util.Scanner;

public class Codeforces1520A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            
            boolean[] seen = new boolean[26];
            boolean ok = true;
            
            char prev = s.charAt(0);
            seen[prev - 'A'] = true;
            
            for(int i = 1; i < n; i++){
                char cur = s.charAt(i);
                
                if(cur != prev){
                    if(seen[cur - 'A']){
                        ok = false;
                        break;
                    }
                    seen[cur - 'A'] = true;
                }
                
                prev = cur;
            }
            
            if(ok){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
