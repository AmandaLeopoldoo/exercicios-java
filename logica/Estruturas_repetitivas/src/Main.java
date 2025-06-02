import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senha = sc.nextInt();

        while (senha != 2004) {
            System.out.println("Senha invalida");
            senha = sc.nextInt();
        }

        System.out.println("Acesso Permitido");

        sc.close();
    }
}
