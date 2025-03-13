package Cp1;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            if(num > 10){
                System.out.println("Número não aceito");
                break;
            }

            int mult = num * i;
            System.out.println(i + " X " + num + " = " + mult );

        }
    }
}
