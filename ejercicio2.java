import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        System.out.println("Hola Clara y Mertxe");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();
        System.out.println("El numero introducido es: " + numero);
        sc.close();
    }

}