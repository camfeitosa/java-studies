// Modificadores de acesso -> visibilidade

// Encapsulamento -> segurança
// private - está encapsulado (restrição para manipulação)
// public - não possui enscapsulamento

// Get e set


package Bank;

import java.util.Scanner;

// a classe Conta é acessível, mas os atributos não

public class Conta {
    private String nome;
    private int conta, saques;
    private double saldo;

    Scanner entrada = new Scanner(System.in);


    public Conta(String nome, int conta, double saldo_inicial) {
        this.nome = nome;
        this.conta = conta;
        saldo = saldo_inicial;
        saques = 0;
    }

    //  O metodo extrato simula a Funcao GET, pois pega os valores

    public void extrato(){
        System.out.println("\tExtrato Bancário"); // \t equivale a tab
        System.out.println("Nome do cliente: " + this.nome);
        System.out.println("Número da conta: " + this.conta);
        System.out.printf("Saldo atual: %.2f\n", this.saldo );  //printf -> format
        System.out.println("Saques realizados hoje: " + this.saques + "\n");
    }

    // Os métodos sacar e depositar simulam a FUNÇÃO SET, pois atualiza os valores

    public void sacar(double valor){ // parametro que não foi declarado
        if (saldo >= valor){
            saldo -= valor;
            saques++;
            System.out.println("Valor sacado da conta: " + valor);
            System.out.println("Novo saldo: " + saldo + "\n");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void depositar(double valor){
        saldo+=valor;
        System.out.println("Valor depositado na conta: " + valor);
        System.out.println("Saldo atualizado: " + saldo);
    }

    public void iniciar(){
        int opc ; // variavel de controle

        do{
            exibeMenu();
            opc = entrada.nextInt();
            escolheOpcao(opc);
        } while (opc!=4);
    }

    public void exibeMenu(){
        System.out.println("\t Escolha a opção desejada: ");
        System.out.println("1 - Consultar Extrato");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        System.out.println("4 - Sair");
        System.out.print("Opção: ");
    }

    public void escolheOpcao(int opc){
       double valor;

        switch(opc){
           case 1:
               extrato();
               break;
           case 2:
               if (saques <= 3){
                   System.out.println("Quanto você deseja sacar? ");
                   valor = entrada.nextDouble();
                   sacar(valor);
               } else {
                   System.out.println("Limite de saques diários excedidos!");
               }
               break;
           case 3:
               System.out.println("Quanto você deseja depositar? ");
               valor = entrada.nextDouble();
               depositar(valor);
               break;
            case 4:
                System.out.println("Sistema encerrado!");
                break;
            default:
                System.out.println("Opção inválida!");
                break;

       }
    }
}
