import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
        System.out.println("enter a num");
        int n= num.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.printf("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.printf("*");

            }
            System.out.println();
        }

    }
        }
