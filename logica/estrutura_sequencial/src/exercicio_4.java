import java.util.Locale;
import java.util.Scanner;

public class exercicio_4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double cachorro, xsalada, xbacon, torrada, refrigerante;

        System.out.println("Digite o codigo do item e a quantidade desejada abaixo: ");
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        cachorro = 4.00;
        xsalada = 4.50;
        xbacon = 5.00;
        torrada = 2.00;
        refrigerante = 1.50;

        if (codigo == 1){
            double soma = cachorro * quantidade;
            System.out.printf("Toatal: R$ %.2f",soma);
        }
        else if (codigo == 2){
            double soma = xsalada * quantidade;
            System.out.printf("Toatal: R$ %.2f",soma);
        }
        else if (codigo == 3){
            double soma = xbacon * quantidade;
            System.out.printf("Toatal: R$ %.2f",soma);
        }
        else if (codigo == 4){
            double soma = torrada * quantidade;
            System.out.printf("Toatal: R$ %.2f",soma);
        }
        else if (codigo == 5){
            double soma = refrigerante * quantidade;
            System.out.printf("Toatal: R$ %.2f",soma);
        }

        sc.close();
    }
}
