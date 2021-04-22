import java.util.ArrayList;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cual es el número a calcular?");
        int n = scanner.nextInt();
        System.out.println("El factorial de " +n+ " es: " + Factorial(n) );
    }

    public static int Factorial(int n){
        int factorial = 1;
        for (int i=1; i <= n; i++){
            factorial = factorial * i;
        }
        return factorial;
    }

}
