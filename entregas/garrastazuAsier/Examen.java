import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EXAMEN PRG 1");

        int edad;
        do {
            edad = sc.nextInt();
        } while (edad < 17 || edad > 70);

        int asignaturas;
        do {
            asignaturas = sc.nextInt();
        } while (asignaturas < 1 || asignaturas > 10);

        int suma = 0;
        int aprobadas = 0;

        for (int n = 1; n <= asignaturas; n++) {
            System.out.print("Nota de la asignatura " + n + ": ");
            int nota = sc.nextInt();

            suma += nota;

            if (nota >= 5) {
                aprobadas++;
            }
        }

        double media = (double) suma / asignaturas;

        System.out.println("Media: " + media);
        System.out.println("Asignaturas aprobadas: " + aprobadas);
    }
}