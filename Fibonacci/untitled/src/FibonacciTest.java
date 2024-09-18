import java.util.Scanner;

public class FibonacciTest{
    public static boolean fibonacci(int n){
        if (n == 0 || n == 1){
            return true;
        }

        int a = 0;
        int b = 1;
        int fibonacci = 0;

        while (fibonacci < n){
            fibonacci = a + b;
            a = b;
            b = fibonacci;
        }
        return fibonacci == n;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println( "Informe um numero para verificar se o mesmo pertence a sequencia de Fibonacci: ");
        int n = sc.nextInt();

        if (fibonacci(n)){
            System.out.println("O número " + n + " É pertencente a sequência de Fibonacci");
        }else {
            System.out.println("O número " + n + " NÃO é pertencente a sequência de Fibonacci");
        }
        sc.close();
    }
}