package Cp1;
import java.util.Scanner;

public class VariosNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primeiro = 0;
        int ultimo = 0;
        boolean primeiroNumero = false;

        while(true){
            int numero = sc.nextInt();

            if(numero == 0){
                break;
            }

            if(!primeiroNumero){
                primeiroNumero = true;
                primeiro = numero;
            }


            ultimo = numero;
        }

        System.out.println(primeiro);
        System.out.println(ultimo);
    }
}
