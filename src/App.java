import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner console = new Scanner(System.in);
        Double valor, horas, salario;
        System.out.println("Digite o valor que você ganha por hora trabalhada: ");
        valor = console.nextDouble();
        System.out.println("Digite o numero de horas trabalhadas: ");
        horas = console.nextDouble();
        salario = (valor * horas);
        
        System.out.println("O seu salário é de: " + salario);


    }
}
