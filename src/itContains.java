import java.util.ArrayList;
import java.util.Scanner;

public class itContains {
    public static void main(String[] args) {
        char letras[];
        char pruebas[];
        pruebas = new char[3];
        letras  = new char[4];
        boolean flag = false;
        int pos = -1;

        letras[0] = 'a';
        letras[1] = 'b';
        letras[2] = 'c';
        letras[3] = 'd';

        pruebas[0] = 'a';
        pruebas[1] = 'b';
        pruebas[2] = 'f';


        /*for (int i = 0; i < letras.length ; i++) {
            System.out.println(letras[i]);
        }*/

        for (int j = 0; j < pruebas.length ; j++) {

            for (int t = 0; t < letras.length; t++) {
                if (pruebas[j] == letras[t]){
                    pos = t;
                }
            }
            if(pos>=0){
                flag = true;
                pos=-1;
                System.out.println("La letra " + pruebas[j] +" está en el arreglo: " + flag);
            }

            else{
                flag=false;
                System.out.println("La letra " + pruebas[j] +" está en el arreglo: " + flag);
            }
        }
    }
}
