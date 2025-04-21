package WeekOne.CheckNumSize;
import java.util.Scanner;

public class CheckNumSize {
    public static void main(String []argh)
    {
        // byte	Stores whole numbers from -128 to 127
        // short	Stores whole numbers from -32,768 to 32,767
        // int	Stores whole numbers from -2,147,483,648 to 2,147,483,647
        // long	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807


        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.close();
        for(int i=0;i<t;i++)
        {   
            try
            {
                long x=sc.nextLong();
                System.out.println(" can be fitted in:");
                if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}