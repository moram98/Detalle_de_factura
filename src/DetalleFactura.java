import java.util.Scanner;

public class DetalleFactura {
    public static void main(String[] args) {
        String nombre;
        double precio1;
        double precio2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Descripcion de factura:");
        nombre = sc.nextLine();
        System.out.println("Escriba el precio  de producto 1");
        precio1 = sc.nextDouble();
        System.out.println("escriba el  precio de  producto 2 ");
        precio2 = sc.nextDouble();

        double total = precio1 + precio2;
        double impuesto = (total * 19) / 100;
        double suma =  total + impuesto;

        System.out.println("La factura " + nombre + " tiene un valor total de " + total + " con un impuesto de "
                + impuesto + " y el monto depues de impuesto es de " + suma);

    }
}
