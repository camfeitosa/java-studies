package Cp1;
import java.util.Scanner;

public class Revisao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero de inicio: ");
        int inicio = sc.nextInt();

        System.out.println("Digite um numero de fim: ");
        int fim = sc.nextInt();

        int anterior = inicio;

        for(int i = inicio; i <= fim; i++) {
            if (i == inicio){
                System.out.println(anterior);
            } else{
                anterior *= i;
                System.out.println(anterior);
            }
        }

        sc.close();

    }
}
