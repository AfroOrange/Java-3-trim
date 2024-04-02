import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introducir nombre: ");
        String nombre = scanner.next();

        System.out.print("Introducir edad: ");
        int edad = scanner.nextInt();

        System.out.print("Introducir altura: ");
        double altura = scanner.nextDouble();


        user usuario_ejemplo = new user(nombre, edad, altura);
        usuario_ejemplo.mostrar_datos();
    }
}
