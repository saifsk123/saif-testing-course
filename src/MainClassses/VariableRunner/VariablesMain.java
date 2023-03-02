package MainClassses.VariableRunner;

import Variables.NonStaticVariables;
import Variables.StaticVariables;

public class VariablesMain
{
    public static void main(String[] args)
    {
        NonStaticVariables obj=new NonStaticVariables();
                int age=obj.age;
              System.out.println(age);
        StaticVariables obj1=new StaticVariables();
        int age2=StaticVariables.age1;
        System.out.println(age2);


    }
}
