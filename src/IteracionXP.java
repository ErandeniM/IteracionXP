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
        System.out.print("*****Bienvenido a la tienda en línea UNISON*****\n"+
                "Costo de envío: $100\n"+
                "Costo de envío en compras mayores a $999: Gratis!!!\n");
        System.out.print("Ingrese el total de su pedido: \n"+"$ ");
        double total = sc.nextDouble();

        double envio = CalculadoraEnvio.calcular(total);

        System.out.printf("Total del pedido: $%.2f%n", total);
        System.out.printf("Costo de envío: $%.2f%n", envio);
        System.out.printf("Monto total a pagar: $%.2f%n", total + envio);

        sc.close();
    }
}
