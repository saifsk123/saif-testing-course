public class PublicacessModifier {
    public void publicMethod()  //method declaration
    {
        //Method body
        String name = "Naveen";
        System.out.println(name);
    }
      public void output() {
          System.out.println("saif");

      }
    public static void main(String[] args)
    {
        PublicacessModifier obj= new PublicacessModifier();
        obj.publicMethod();
        obj.output();
    }
}
