import java.util.Locale;
import java.util.Scanner;

public class exercicio_4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo, num_peca;
        double valor, soma, total1, total2, valor_final;

        codigo = sc.nextInt();
        num_peca = sc.nextInt();
        valor = sc.nextDouble();

        soma = num_peca * valor;
        total1 = soma;

        codigo = sc.nextInt();
        num_peca = sc.nextInt();
        valor = sc.nextDouble();

        soma = num_peca * valor;
        total2 = soma;

        valor_final = total1 + total2;

        System.out.printf("VALOR A PAGAR: R$ %.2f %n", valor_final);

        sc.close();
    }

}