import java.util.Scanner;

public class Codeforces116A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int current = 0;
        int maxCapacity = 0;
        
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            current = current - a + b;
            
            if (current > maxCapacity) {
                maxCapacity = current;
            }
        }
        
        System.out.println(maxCapacity);
        scanner.close();
    }
}
