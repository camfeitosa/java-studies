package Bank;

import java.util.Scanner;
import java.util.Random;

public class Caixa {
    public static void main(String[] args) {
        String nome;
        double inicial;
        Scanner entrada = new Scanner(System.in);
        Random numero = new Random();
        int conta = 1 + numero.nextInt(9999); // conta começa com 1 e vai até 9999 -> começa em 0 -> 9998

        System.out.println("Cadastrando um novo cliente");
        System.out.print("Digite o seu nome: ");
        nome = entrada.nextLine();

        System.out.print("Digite o valor inicial depositado na conta: ");
        inicial = entrada.nextDouble();

        Conta minhaConta = new Conta(nome, conta, inicial); // metodo construtor
        minhaConta.iniciar();
        entrada.close();

    }
}
