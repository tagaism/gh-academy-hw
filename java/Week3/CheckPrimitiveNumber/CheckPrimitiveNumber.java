package Week3.CheckPrimitiveNumber;

import java.util.Scanner;

public class CheckPrimitiveNumber {
    public static void main(String[] args) {
        // byte	Stores whole numbers from -128 to 127
        // short	Stores whole numbers from -32,768 to 32,767
        // int	Stores whole numbers from -2,147,483,648 to 2,147,483,647
        // long	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127) {
                    System.out.println("* byte");
                }
                if(x>=-32_768 && x <=32_768) {
                    System.out.println("* short");
                }
                if(x>=-2_147_483_648 && x <=2_147_483_647) {
                    System.out.println("* int");
                }
                // if((x + 1)>=-9223372036854775809 && (x - 1)<=9223372036854775806)System.out.println("* long");
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
        sc.close();
    }
}
