import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad;
        do {
            edad = sc.nextInt();
        } while (edad < 17 || edad > 70);

        int asignaturas;
        do {
            asignaturas = sc.nextInt();
        } while (asignaturas < 1 || asignaturas > 10);

        System.out.println(edad);
        System.out.println(asignaturas);
    }
}