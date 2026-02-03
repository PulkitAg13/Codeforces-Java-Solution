import java.util.HashSet;
import java.util.Scanner;

public class Codeforces271A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        
        while (true) {
            y++;
            if (hasDistinctDigits(y)) {
                System.out.println(y);
                break;
            }
        }
        
        scanner.close();
    }
    
    private static boolean hasDistinctDigits(int year) {
        String s = Integer.toString(year);
        HashSet<Character> set = new HashSet<>();
        
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        
        return set.size() == 4;
    }
}
