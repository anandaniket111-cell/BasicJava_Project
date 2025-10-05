package java_days;

public class SwapTwoNumWithoutUsingThiredVariable {


    public static void main(String[] args) {
         int a=10;  //40
         int b=30;  //40-30 = 10

         a=a+b;
         b=a-b;
         a=a-b;

        System.out.println("AFTER SWAPING A IS " +  a +" "+"AFTER SWAPING B IS "+  b);

    }
}
