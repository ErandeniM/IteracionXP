import java.util.Locale;
import java.util.Scanner;

/**
 * Problema: Se requiere implementar una función que calcule el costo de envío de una tienda en línea.
 * Historia de usuario:
 * <p>
 * Historia de usuario:
 * Como cliente de una tienda en línea,
 * quiero conocer el costo de envío de mi pedido
 * para conocer el monto total antes de comprar.
 * Crear un repositorio y subir el URL al repositorio
 */

public class IteracionXP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); //nextDouble() espera coma decimal y truena con InputMismatchException si escribes 499.99

        System.out.println("*****Bienvenido a la tienda en línea UNISON*****");
        System.out.println("Costo de envío:");
        System.out.println("  Menos de $500 .......... $100");
        System.out.println("  $500 a $999.99 ......... $50");
        System.out.println("  $1,000 o más ........... Gratis");
        System.out.println("  Clientes Premium ....... Gratis siempre");
        System.out.println();

        System.out.print("Ingrese el total de su pedido:\n$ ");
        double total = sc.nextDouble();

        System.out.print("¿Es cliente Premium? (s/n): ");
        boolean esPremium = sc.next().equalsIgnoreCase("s");

        double envio = CalculadoraEnvio.calcular(total, esPremium);

        System.out.println();
        System.out.printf("Total del pedido:    $%.2f%n", total);
        System.out.printf("Costo de envío:      $%.2f%n", envio);
        System.out.printf("Monto total a pagar: $%.2f%n", total + envio);

        sc.close();
    }
}