import java.util.Scanner;

public class Codeforces702A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int[] a = new int[n];
 
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
 
        int cur = 1;
        int max = 1;
 
        for(int i=1;i<n;i++){
            if(a[i] > a[i-1]){
                cur++;
            }else{
                cur = 1;
            }
            if(cur > max){
                max = cur;
            }
        }
 
        System.out.println(max);
    }
}
