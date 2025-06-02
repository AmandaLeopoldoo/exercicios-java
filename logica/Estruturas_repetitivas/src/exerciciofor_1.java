import java.util.Scanner;

public class exerciciofor_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) { //DIFERENTE DE ZERO//
                System.out.println(i);
            }
        }

        sc.close();
    }
}
