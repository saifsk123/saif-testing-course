public class Returntypemethods
{
    public int addition()
    {
        int a=10;
        int b=20;
        int c=a+b;
        return c;
    }
        public int paramAddition (int a, int b)
        {
            int c=a+b;
            return c;
        }
             public void multiply()
             {
                 int a=10;
                 int b=30;
                 int c=a*b;
                 System.out.println(c);
             }
          public void sub()
          {
              int a=20;
              int b=10;
              int c=a-b;
              System.out.println(c);
          }
    public static void main(String[] args)
    {
        Returntypemethods obj= new Returntypemethods();
         obj.addition();
                 int d= obj.addition();
                 int e=d*20;
                 System.out.println(e);
                 int g=obj.paramAddition(30,40);
                  System.out.println(g);
                  int f=obj.paramAddition(40, 50);
                 System.out.println(f);
          }
}