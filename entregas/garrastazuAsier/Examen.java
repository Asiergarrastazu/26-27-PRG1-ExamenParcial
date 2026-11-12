import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EXAMEN PRG 1");

        int edad;
        do {
            edad = sc.nextInt();
        } while (edad < 17 || edad > 70);

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        int asignaturas;
        do {
            asignaturas = sc.nextInt();
        } while (asignaturas < 1 || asignaturas > 10);

        int suma = 0;
        int aprobadas = 0;
        int suspensas = 0;

        for (int n = 1; n <= asignaturas; n++) {
            System.out.print("Nota de la asignatura " + n + ": ");
            int nota = sc.nextInt();

            suma += nota;

            if (nota >= 5) {
                aprobadas++;
            } else {
                suspensas++;
            }
        }

        double media = (double) suma / asignaturas;

        System.out.println("Media: " + media);
        System.out.println("Asignaturas aprobadas: " + aprobadas);
        System.out.println("Asignaturas suspensas: " + suspensas);
    }
}