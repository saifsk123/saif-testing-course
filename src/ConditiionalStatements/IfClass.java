package ConditiionalStatements;

public class IfClass {
    public static void main(String[] args) {
        int i=10;
        int j=20;

        if(i==10)
        {
            System.out.println("true");
        }

             if (i==10)
             {System.out.println("false");
                 if (j==20)
            {
                System.out.println(j);
            }
            else
            {
                System.out.println("j value is not equal to 20");
            }
        }
        else
        {
            System.out.println("false");
        }
         if (i==10)
        {
            System.out.println("true");
        }

           else if (i==20)
            {
                System.out.println(false);
            }
            else if(i==30)
            {
                System.out.println("output should not be greater than 20");

            }

    }

}
