import java.util.Scanner;

class daysMonth2 {

    final static int ENERO = 1;
    final static int FEBRERO = 2;
    final static int MARZO = 3;
    final static int ABRIL = 4;
    final static int MAYO = 5;
    final static int JUNIO = 6;
    final static int JULIO = 7;
    final static int AGOSTO = 8;
    final static int SEPTIEMBRE = 9;
    final static int OCTUBRE = 10;
    final static int NOVIEMBRE = 11;
    final static int DICIEMBRE = 12;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Cual es el mes (Num Mes)? ");
        int mes = input.nextInt();

        if (mes > 12){
            System.out.println("El mes no puede ser mayor a 12");
        }else{
             System.out.println("Cual es el anio (num Anio)? ");
            int anio= input.nextInt();

            System.out.println("El mes tiene: " + cuantosDias(mes, anio)+ " dias");
        }

       
    }

    public static int cuantosDias(int mes, int anio){
        int dias=0;
       /* String meses[];
        meses = new String[4];
*/
        //Regresa los meses con 30 dias
        if (mes == ABRIL || mes == JUNIO || mes == SEPTIEMBRE || mes == NOVIEMBRE){
            dias = 30;
        }else{
            if (mes == FEBRERO){
                if(esBisiesto(anio)){
                    dias = 29;
                }else{
                    dias = 28;
                }
            }else{
                dias = 31;
            }
        }

       /* meses[0]= "abril";
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
        }*/
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


