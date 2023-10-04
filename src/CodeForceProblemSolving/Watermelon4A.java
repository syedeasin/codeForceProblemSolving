package CodeForceProblemSolving;
import java.util.Scanner;

public class Watermelon4A {
    public static void main(String[] args) {
        int w;
        Scanner sc = new Scanner(System.in);
        w = sc.nextInt();
        if(w>2)
        {
            if (w%2==0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
        else
        {
            System.out.println("NO");
        }
    }
}