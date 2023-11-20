import java.util.Scanner;
public class SucesionNumerica {
    
    public static void main(String[] args) {
        Scanner scannerd = new Scanner(System.in);
        int n;
        int cont = 0;
        double suma = 0;

        var genNum = 1;
        boolean esPrimo;
        var esPrimoNum = false;
        var contPrimos = 0;

        int fibo = 0;
        var primero = 1;
        var segundo = 1;

        do {
            System.out.print("Ingrese el valor de n: ");
            n = scannerd.nextInt();
        } while (n <= 0);

        fibo = primero + segundo;
        primero = segundo;
        segundo = fibo;
        while (cont < n) {
            genNum = genNum + 1;
            esPrimo = true;
            for(var div = 2; div < genNum; div ++) {
                if (genNum % div == 0) {
                    esPrimo = false;
                }
            }
            if (esPrimo == true) {
                if (esPrimoNum == true) {
                    System.out.printf("-%d/%d\n", genNum, fibo);
                    suma -= (double) genNum/fibo;
                } else {
                    System.out.printf("+%d/%d\n", fibo, genNum);
                    suma += (double) fibo/genNum;
                }
                contPrimos = contPrimos + 1;
                if (contPrimos == fibo) {
                    esPrimoNum = !esPrimoNum;
                    fibo = primero + segundo;
                    primero = segundo;
                    segundo = fibo;

                    contPrimos = 0;

                }
                cont = cont + 1;


            }


        }
        System.out.println("La suma de los " + n + " primeros elementos de la sucesión es: " + suma);



    }
}

