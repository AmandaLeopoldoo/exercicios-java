import java.util.Scanner;

public class exercicio_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dígite um valor: ");
        double valor = sc.nextDouble();

        if (valor >= 0.25 && valor <= 25.50 ) {
            System.out.println("Intervalo (0,25].");
        }
        else if (valor >= 25.50 && valor <= 50.75) {
            System.out.println("Intervalo [25,50].");
        }
        else if (valor >= 50.75 && valor <= 100) {
            System.out.println("Intervalo (75,100].");
        }
        else {
            System.out.println("Fora de intervalo.");
        }

        sc.close();
    }
}
