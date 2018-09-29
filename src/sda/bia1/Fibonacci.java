package sda.bia1;

public class Fibonacci {
    private int howManyElements;
    private int elem_1 =1;
    private int elem_2 =1;


    public Fibonacci(int howMany){
        howManyElements = howMany;
    }
    public void fibIter(){
        switch (howManyElements){
            case 0 :
                System.out.println("0");
                break;
            case 1:
                System.out.println(elem_1);
                break;
           default:
                System.out.println(elem_1);
                System.out.println(elem_2);
        }

        for(  int it = 3; it<=howManyElements; it++){
            int actualFib = elem_1 +elem_2;
            System.out.println(actualFib);
            elem_2 =elem_1;
            elem_1 = actualFib;
        }
    }
}
