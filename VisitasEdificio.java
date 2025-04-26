import java.util.Scanner;

public class VisitasEdificio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edad = solicitarEdad(scanner);
        mostrarMayorOMenor(edad);

        double tiempoPromedio = registrarVisitas(scanner, 7);

        mostrarResultados(edad, 7, tiempoPromedio);

        scanner.close();
    }

    // Método para pedir la edad
    public static int solicitarEdad(Scanner scanner) {
        System.out.print("Ingrese su edad: ");
        return scanner.nextInt();
    }

    // Método para mostrar si es mayor o menor de edad
    public static void mostrarMayorOMenor(int edad) {
        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }
    }

    // Método para registrar las visitas y calcular el promedio
    public static double registrarVisitas(Scanner scanner, int cantidadVisitas) {
        double totalTiempo = 0.0;

        for (int i = 1; i <= cantidadVisitas; i++) {
            System.out.println("\nVisita #" + i);
            System.out.print("¿Cuántas horas estuvo en la visita? ");
            double tiempoVisita = scanner.nextDouble();
            totalTiempo += tiempoVisita;
        }

        return totalTiempo / cantidadVisitas;
    }

    // Método para mostrar los resultados finales
    public static void mostrarResultados(int edad, int totalVisitas, double tiempoPromedio) {
        System.out.println("\n--- Resultados ---");
        System.out.println("Edad: " + edad + " años");
        System.out.println("Total de visitas: " + totalVisitas);
        System.out.printf("Tiempo promedio de estancia: %.2f horas%n", tiempoPromedio);
    }
}