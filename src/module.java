import java.util.Scanner;

public class module{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame un número (divisor)");
        int a=leer.nextInt();
        System.out.println("Dame otro número (dividendo)");
        int b=leer.nextInt();

        System.out.println("El módulo de esos números es: " + module(a, b));


    }

    public static int module(int a, int b){

        int res;
        res = (b/a)*a-b;
        if (res<0) {
            res=res*-1;

        }


        return res;

    }

}