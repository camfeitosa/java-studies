package Cp1;

import java.util.Scanner;

public class Frase {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       String frase;

       System.out.println("Digite uma frase: ");

       while (true){
           frase = sc.nextLine();

           if (frase.equalsIgnoreCase("PARE")){
               break;
           }
           System.out.println(frase);
           System.out.println("Digite outra frase ou PARE para encerrar: ");

       }

       System.out.println("Programa finalizado com sucesso!");
       sc.close();
    }
}
