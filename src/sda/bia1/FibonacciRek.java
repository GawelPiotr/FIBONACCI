package sda.bia1;

public class FibonacciRek {
    private int elem;

    public FibonacciRek(int whichElement){
        elem = whichElement;
    }
    public int fibRek(){
        if (elem<=2){
            return 1;
        }else {
            int acctualFib = new FibonacciRek(elem -2).fibRek()
                    + new FibonacciRek(elem -1).fibRek();
        return acctualFib;
        }
    }
}
