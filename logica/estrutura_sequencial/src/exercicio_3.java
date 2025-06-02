import java.util.Scanner;

public class exercicio_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n1 % n2 == 0 || n2 % n1 == 0 ) {
            System.out.println("Säo Múltiplos");
        }
        else {
            System.out.println("Näo säo Múltiplos");
        }

        sc.close();
    }
}
