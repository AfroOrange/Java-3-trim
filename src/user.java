import java.util.InputMismatchException;
import java.util.Scanner;

public class user {
    private String nombre;
    private int edad;
    private double altura;

    public user(String nombre, int edad, double altura) {
        Scanner scanner = new Scanner(System.in);

        this.nombre = nombre;

        while (edad <= 0) {
            try {
                System.out.println("No se puede introducir edad menor que cero");
                edad = scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Error: Ingrese un número válido para la edad:");
            } catch (Exception e) {
                System.out.println("Error: Ingrese un número válido para la edad:");
            }
            this.edad = edad;

            while (altura <= 0) {
                try {
                    System.out.println("No se puede introducir una altura igual o menor que cero");
                    altura = scanner.nextInt();
                } catch (InputMismatchException e) {
                    scanner.nextLine();
                    System.out.println("Error: Ingrese un número válido para la edad:");
                } catch (Exception e) {
                    System.out.print("Error: Ingrese un número válido para la altura:");
                }
            }
            this.altura = altura;
        }
    }
    public void mostrar_datos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad:   " + this.edad);
        System.out.println("Altura: " + (this.altura / 100) + "m");
    }
}

