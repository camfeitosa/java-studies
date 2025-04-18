package Cp2.CorrecaoFuncionario;

public class Administrativo extends Assistente{
    private String turno;
    private double adicionalNoturno;

    public Administrativo(String nome, double salario, int matricula, String turno, double adicionalNoturno){
        super(nome, salario, matricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    @Override
    public void exibeDados(){
        System.out.println("Cargo: Administrativo");
        super.exibeDados();
        System.out.println("Turno: "+turno);
        if(turno.equalsIgnoreCase("noite")){
            System.out.println("Adicional Noturno: R$ " + adicionalNoturno);
            System.out.println("Salário Total: R$ " + salario + adicionalNoturno);
        } else{
            System.out.println("Salário Total:R$ " + salario);
        }




    }

}
