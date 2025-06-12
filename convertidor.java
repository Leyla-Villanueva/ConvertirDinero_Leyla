import java.util.Scanner;

class Convertidor {
    public static void main(String[] args) {
        double pesosMexicanos; 
        double dolaresAmericanos; 
        double euros; 
        int opcion;
        do{
        System.out.println("-------convertidor de pesos-------");
        System.out.println("escoge una opcion");
        System.out.println("1. Convertir pesos mexicanos a dolares americanos");
        System.out.println("2. Convertir pesos mexicanos a euros");
        System.out.println("3. Convertir dolares americanos a pesos mexicanos");
        System.out.println("4. Convertir euros a pesos mexicanos");
        System.out.println("5. Salir");
        Scanner scanner = new Scanner(System.in);
        opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad de pesos mexicanos a convertir a dolares americanos:");
                    pesosMexicanos = scanner.nextDouble();
                    dolaresAmericanos = pesosMexicanos / 17.5;
                    System.out.printf("La cantidad de dolares americanos es: %.2f%n", dolaresAmericanos);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de pesos mexicanos a convertir a euros:");
                    pesosMexicanos = scanner.nextDouble();
                    euros = pesosMexicanos / 19.2;
                    System.out.printf("La cantidad de euros es: %.2f%n", euros);
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad de dolares americanos a convertir a pesos mexicanos:");
                    dolaresAmericanos = scanner.nextDouble();
                    pesosMexicanos = dolaresAmericanos * 17.5;
                    System.out.printf("La cantidad de pesos mexicanos es: %.2f%n", pesosMexicanos);
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de euros a convertir a pesos mexicanos:");
                    euros = scanner.nextDouble();
                    pesosMexicanos = euros * 19.2;
                    System.out.printf("La cantidad de pesos mexicanos es: %.2f%n", pesosMexicanos);
                    break;
                case 5:
                    System.out.println("Saliendo del convertidor...");
                    return; 
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción del 1 al 5.");
                    break;
            } 

        } while (opcion < 5 && opcion > 0);
    }
}