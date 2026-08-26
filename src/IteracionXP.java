import java.util.Scanner;

/**
 * Problema: Se requiere implementar una función que calcule el costo de envío de una tienda en línea.
 * Historia de usuario:
 *
 * Historia de usuario:
 * Como cliente de una tienda en línea,
 * quiero conocer el costo de envío de mi pedido
 * para conocer el monto total antes de comprar.
 * Crear un repositorio y subir el URL al repositorio
 */

public class IteracionXP {
    public static void main(String[] args) {
        System.out.print("*****Bienvenido a la tienda en línea UNISON*****\n"+
                "Costo de envío: $100\n"+
                "Costo de envío en compras mayores a $999: Gratis!!!\n");
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el total de su pedido: \n" + "$");
        double total = input.nextDouble();
        input.nextLine();

        CalculadoraEnvio costoEnvio = new CalculadoraEnvio();
        CalculadoraEnvio.calcular(total);
        System.out.printf("El total de su pedido es: $%.2f",total);
        System.out.println();
        if (total > 999) {
            System.out.println("El costo de envío es totalmente gratis. ");
        } else {

            System.out.println("Costo de envío:"+costoEnvio );
        }

    }

    public static class CalculadoraEnvio {
        public static double calcular(double subtotal) {
            return 100.0;
        }
    }

}