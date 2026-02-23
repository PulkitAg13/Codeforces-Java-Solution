import java.util.ArrayList;
import java.util.Scanner;

public class Codeforces490A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        ArrayList<Integer> three = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            int x = sc.nextInt();

            if(x == 1) one.add(i);
            else if(x == 2) two.add(i);
            else three.add(i);
        }

        int w = Math.min(one.size(), Math.min(two.size(), three.size()));

        System.out.println(w);

        for(int i = 0; i < w; i++) {
            System.out.println(one.get(i) + " " + two.get(i) + " " + three.get(i));
        }
    }
}
