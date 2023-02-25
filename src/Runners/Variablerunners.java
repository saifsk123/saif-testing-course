package Runners;

import Variables.Nonstaticvariable;
import Variables.Staticvariables;

public class Variablerunners
{
    public static void main(String[] args) {
        Nonstaticvariable obj=new Nonstaticvariable();
        int s=obj.age2;
        System.out.println(s);
        int k= Staticvariables.age1;
        System.out.println(k);
    }
}
