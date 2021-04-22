import java.util.Scanner;

public class daysMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cuál es el mes? ");
        String mes = input.next();
        System.out.println("¿Cuál es el año? ");
        int anio= input.nextInt();

        /*if(mes=="febrero"){
            System.out.println("¿Cuál es el año?: ");
            int anio = input.nextInt();
            System.out.println("¿El año es bisiesto?: " + esBisiesto(mes, anio));
        }
        else{
            System.out.println("El mes de " +mes + " tiene 31 días");
        }*/

        System.out.println("El mes tiene: " + cuantosDias(mes, anio)+ " días");




    }

    public static int cuantosDias(String mes, int anio){
        int dias=0;
        String meses[];
        meses = new String[4];

        meses[0]= "abril";
        meses[1]= "junio";
        meses[2]= "septiembre";
        meses[3]= "noviembre";

        for (int i = 0; i < meses.length; i++) {
            if (mes.equals(meses[i])) {
                dias = 30;
                //return dias;

            }

            else {
                if (!mes.equals("febrero")) {
                    dias = 31;
                    //return dias;

                }
                else {
                    if(esBisiesto(anio)){
                        dias = 29;
                        //return dias;
                    }
                    else{
                        dias = 28;
                        //return dias;
                    }
                }

            }
        }
        return dias;

    }

    public static boolean esBisiesto(int anio){
        boolean flag = false;
        if (anio % 400 == 0) {
                flag = true;
                return flag;
        }
        else {
            if (anio % 4 == 0 && anio % 100 != 0) {
                flag = true;
                return flag;
            }
            else {
                return flag;
            }
        }

    }
}


