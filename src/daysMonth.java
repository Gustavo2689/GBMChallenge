import java.util.Scanner;

public class daysMonth {//Esta es una solución al problema 4 de regresar cuantos días tiene un mes.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cuál es el mes? ");//Aquí le estoy pidiendo el mes que desea saber.
        String mes = input.next();//Lo guardo en una variable para usarla posteriormente.
        System.out.println("¿Cuál es el año? ");//Aquí le pido el año que, aunque no lo solicita, es importante para 'cachar un posible escenario'.
        int anio= input.nextInt();//guardo el resultado en una variable para posteriormente usarla.

        /*if(mes=="febrero"){
            System.out.println("¿Cuál es el año?: ");
            int anio = input.nextInt();
            System.out.println("¿El año es bisiesto?: " + esBisiesto(mes, anio));
        }
        else{
            System.out.println("El mes de " +mes + " tiene 31 días");
        }*/

        System.out.println("El mes tiene: " + cuantosDias(mes, anio)+ " días"); //Ejecuto e imprimo el resultado




    }
    //Éste método me permite saber cuantos días tiene el mes en cuestión.
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

    //Este método me va a indicar si el año que ingresó el usuario es bisiesto. Esto para saber, con certeza, cuantos días tiene el mes si resulta ser febrero.
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


