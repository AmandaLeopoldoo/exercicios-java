import java.util.Scanner;

public class exercicio_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Esse número é PAR");
        }
        else {
            System.out.println("Esse número é IMPAR");
        }

        sc.close();
    }
}

