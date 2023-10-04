package CodeForceProblemSolving;

import java.util.Scanner;

public class WayTooLongWords71A {
    public static void main(String[] args) {
        int n,count=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n>0 && count!=n)
        {
            String word = sc.next();
            int length = word.length();

            if(length>10)
            {
                String finalResults = word.charAt(0)+Integer.toString(length-2)+word.charAt(length-1);
                System.out.println(finalResults);
            }
            else
            {
                System.out.println(word);
            }
            count++;
        }

    }
}
