import java.util.Scanner;

public class Codeforces1900A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            
            int countDot = 0;
            int maxSeg = 0;
            int i = 0;
            
            while(i < n){
                if(s.charAt(i) == '.'){
                    int len = 0;
                    while(i < n && s.charAt(i) == '.'){
                        len++;
                        i++;
                    }
                    maxSeg = Math.max(maxSeg, len);
                    countDot += len;
                } else {
                    i++;
                }
            }
            
            if(maxSeg >= 3){
                System.out.println(2);
            } else {
                System.out.println(countDot);
            }
        }
    }
}
