import java.util.Scanner;
public class Codeforces71A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        while(n > 0){
            String word = sc.nextLine();
            int len = word.length();
            if(len > 10){
                char first = word.charAt(0);
                char last = word.charAt(len-1);
                String mid = String.valueOf(len - 2);
                System.out.println(first + mid + last);
            }
            else{
                System.out.println(word);
            }
            n--;
        }
    }
}

