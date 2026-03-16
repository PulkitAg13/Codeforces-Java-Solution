import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces1890A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            HashMap<Integer,Integer> m = new HashMap<>();

            for(int i=0;i<n;i++){
                int x = sc.nextInt();
                m.put(x, m.getOrDefault(x,0)+1);
            }

            if(m.size() > 2){
                System.out.println("No");
            }
            else if(m.size() == 1){
                System.out.println("Yes");
            }
            else{
                ArrayList<Integer> v = new ArrayList<>(m.values());
                if(Math.abs(v.get(0)-v.get(1)) <= 1){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }
    }
}
