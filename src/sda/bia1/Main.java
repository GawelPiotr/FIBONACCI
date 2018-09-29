package sda.bia1;
//iteracie -> pętle
//rekurecja
public class Main {
    public static void main(String[] args) {
        new Fibonacci(5).fibIter();
        System.out.println("---------------------");
        System.out.println(new FibonacciRek(5).fibRek());

    }
}
