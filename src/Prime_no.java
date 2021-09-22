import java.util.Scanner;

public class Prime_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int limit1,limit2,i,x;
        System.out.println("Enter the limit =");
        limit1= sc.nextInt();
        limit2 =sc.nextInt();
        for (x=limit1+1;x<=limit2-1;x++)
        {
            for (i=2;i<=x;i++)
            {
                if (x%i==0)
                    break;
            }
            if (i==x) {
                System.out.println(i);

            }
        }

    }
}


