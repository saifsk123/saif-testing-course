package LoopStatements;

public class Whileloop {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i <= 10) {
            sum = sum + i;//0+0=0,
            i++;//i=i+1;0+1=1,2
        }
        System.out.println(sum);
        i = 0;
        sum = 0;
        while (i <= 10) {
            sum = sum + i;
            if (sum == 10) {
                break;
            }
            i++;
        }
        System.out.println(sum);
        i=0;
        sum=0;
        while (i<=10)
        {
            if (i==4)
            {
                i++;
                continue;
            }
            sum=sum+i;
            i++;
        }

    }
}
