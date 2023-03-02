package MainClassses.Methods;

import Methods.Methods_WithParameters;
import Methods.Methods_WithReturnType;

public class MainRUnner {
    public static void main(String[] args) {
        Methods_WithParameters obj=new Methods_WithParameters();
        obj.add(2,3);
        obj.add(5,7);
        Methods_WithParameters.sub( 3,1);
        Methods_WithParameters.sub(4,6);
        Methods_WithReturnType obj1=new Methods_WithReturnType();
        System.out.println(obj1.verifyuser( "xyz","xxxx"));
    }
}
