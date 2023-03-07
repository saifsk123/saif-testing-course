package MainClassses.VariableRunner;

import Variables.NonStaticVariables;
import Variables.Staticvariables;
import Variables.Staticvariables;

public class VariablesMain
{
    public static void main(String[] args)
    {
        NonStaticVariables obj=new NonStaticVariables();
                int age=obj.age;
              System.out.println(age);
        Staticvariables obj1=new Staticvariables();
        int age2=Staticvariables.age1;
        System.out.println(age2);


    }
}
