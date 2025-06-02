import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num, horas;
        double valor_horas, salario;

        num = sc.nextInt();
        horas = sc.nextInt();
        valor_horas = sc.nextDouble();

        salario = valor_horas * horas;

        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f %n", salario);

        sc.close();

    }

}

