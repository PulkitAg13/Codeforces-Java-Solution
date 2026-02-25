import java.util.HashSet;
import java.util.Scanner;

public class Codeforces1703B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            
            HashSet<Character> set = new HashSet<>();
            int total = 0;
            
            for(int i = 0; i < n; i++){
                char c = s.charAt(i);
                if(set.contains(c)){
                    total += 1;
                } else {
                    total += 2;
                    set.add(c);
                }
            }
            
            System.out.println(total);
        }
    }
}
