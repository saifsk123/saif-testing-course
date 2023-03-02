public class Parameters
{
    public int add(int a,int b,int c)
    {
        int d=a+b+c;
        return(d);
    }

    public static void main(String[] args)
    {
        Parameters obj=new Parameters();
        int s=obj.add(12,15,17);
        System.out.println(s);
    }
}
