package Arrays;

public class ArrayPrograms
{
static int[] a={1,2,3,4,5,6,7,8,9,10};

    public static void main(String[] args)
    {

        int[] c =new int[5];

          c[0]=1;
          c[1]=2;
          c[2]=3;
          c[3]=4;
          c[c.length-1]=5;
          int size1= c.length;
          for (int i=0;i<=size1-1;i++)
          {
              System.out.println(c[i]);
          }



    }
}
