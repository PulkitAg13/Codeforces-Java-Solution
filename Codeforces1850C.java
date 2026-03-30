import java.util.Scanner;

public class Codeforces1850C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            char[][] g = new char[8][8];

            for(int i=0;i<8;i++){
                String s = sc.next();
                for(int j=0;j<8;j++){
                    g[i][j] = s.charAt(j);
                }
            }
                    
            for(int j=0;j<8;j++){
                String ans = "";
                for(int i=0;i<8;i++){
                    if(g[i][j] != '.'){
                        ans += g[i][j];
                    }
                }
                if(ans.length() > 0){
                    System.out.println(ans);
                    break;
                }
            }
        }
    }
}
