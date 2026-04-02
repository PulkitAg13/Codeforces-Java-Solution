import java.util.Scanner;

public class Codeforces1877A {
    public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	while(t-->0){
	    int n = sc.nextInt();
	    int ans = 0;
	    for(int i = 0; i < n-1; i++){
	        int x = sc.nextInt();
	        ans += x;
	    }
	    System.out.println(-ans);
	}
	}
}
