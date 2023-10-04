package CodeForceProblemSolving;

import java.util.Scanner;

public class GoodKid1873B {
    public static void main(String[] args) {
        int t,n,count = 0;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while (count < t)
        {
            n = sc.nextInt();
            int productArray[] = new int[n];
            int temp = 9, index = -1, maxProducts=1;
            //Array Input Taking
            for(int i = 0; i<productArray.length ; i++)
            {
                productArray[i] = sc.nextInt();
                if (temp>=productArray[i])
                {
                    temp = productArray[i];
                    index = i;
                }
            }

            for(int i = 0; i<productArray.length ; i++)
            {
                if (i==index)
                {
                    productArray[i] = productArray[i] + 1;
                }
                maxProducts = maxProducts*productArray[i];
            }
            System.out.println(maxProducts);
            count++;
        }
    }
}
