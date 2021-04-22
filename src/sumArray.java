public class sumArray {
    public static void main(String[] args) {
        int numeros[];
        numeros = new int[5];
        numeros[0]=1;
        numeros[1]=34;
        numeros[2]=56;
        numeros[3]=72;
        numeros[4]=123;

        int sumTotal = 0;

        for (int i = 0; i < numeros.length ; i++) {
            sumTotal= sumTotal + numeros[i];

        }
        System.out.println(sumTotal);



    }
}
