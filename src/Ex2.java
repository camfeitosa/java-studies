import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a sua altura: ");
    double altura = sc.nextDouble();

    System.out.println("Digite o seu sexo: F (feminino) ou M (masculino)");
    char sexo = sc.next().charAt(0);

    String sexoUpper = String.valueOf(sexo).toUpperCase(); 
    double pesoIdeal;

    switch(sexoUpper){
      case "F":
        pesoIdeal = (72.2 * altura) - 58;
        System.out.println("O seu peso ideal é: " + pesoIdeal);
        break;
      case "M":
        pesoIdeal = (62.1 * altura) - 44.7;
        System.out.println("O seu peso ideal é: " + pesoIdeal);
        break;
      default: 
        System.out.println("Sexo inválido");   
    } 

  }
}
