import java.util.Scanner;

class RegistroVisitante {
    public static void main(String[] args) {
        // Declaración de variables con tipos de datos primitivos
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del visitante: ");
        String nombre = scanner.nextLine();  // String (no primitivo, pero necesario para texto)

        System.out.print("Ingrese la edad del visitante: ");
        byte edad = scanner.nextByte();  // byte (edad normalmente cabe en este rango)
        scanner.nextLine(); // Limpiar el bufer despues de nextByte()

        System.out.print("Ingrese su numero de identificacion (formato 1-345-678): ");
        String numeroIdentificacion = scanner.nextLine(); // Leer numero de identificacion correctamente

        System.out.print("Ingrese el tiempo de visita en minutos: ");
        short tiempoVisita = scanner.nextShort();  // short (valor pequeño para minutos)
        scanner.nextLine(); // Limpiar el bufer despues de nextShort()

        System.out.print("Ingrese el numero de apartamento a visitar: ");
        long numeroApartamento = scanner.nextLong();  // long (numeros grandes)
        scanner.nextLine(); // Limpiar el bufer despues de nextLong()

        System.out.print("Ingrese la calificacion de riesgo del visitante (0.0 - 10.0): ");
        double riesgo = scanner.nextDouble();  // double (más precisión en decimales)
        scanner.nextLine(); // Limpiar el búfer después de nextDouble()

        // Caracter (Ejemplo: Primera letra del nombre)
        char inicialNombre = nombre.charAt(0); // char (un solo carácter)

        // Mostrar la información del visitante
        System.out.println("\n--- Registro de Visitante ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Inicial del Nombre: " + inicialNombre);
        System.out.println("Edad: " + edad);

        // Validación del número de identificación
        if (numeroIdentificacion.matches("\\d{1}-\\d{3}-\\d{3}")) {
            System.out.println("Numero de Identificacion valido: " + numeroIdentificacion);
        } else {
            System.out.println(" error: El número de identificación debe seguir el formato 123-456-789.");
        }

        System.out.println("Tiempo de Visita: " + tiempoVisita + " minutos");
        System.out.println("Numero de Apartamento a visitar: " + numeroApartamento);

        System.out.println("Calificacion de Riesgo: " + riesgo);

        scanner.close();
    }
}