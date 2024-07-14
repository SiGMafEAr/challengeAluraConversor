import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Convertidor {

    public static void convertir(String divisaBase, String divisaObjetivo, ServicioConversion servicio,
            Scanner entrada) {
        double monto;
        double montoConvertido;
        Date fechaActual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        TasaCambio tasa = servicio.getTasa(divisaBase, divisaObjetivo);

        if (tasa != null) {
            System.out.println("La tipo de cambio para hoy " + formato.format(fechaActual) +
                    "\n1 " + divisaBase + " = " + tasa.getTasaConversion() + " " + divisaObjetivo);

            try {
                System.out.println("Ingrese el monto que desea convertir de " + divisaBase);
                monto = Double.parseDouble(entrada.nextLine());
                montoConvertido = monto * tasa.getTasaConversion();
                System.out.println("El monto " + monto + " " + divisaBase + " El tipo de cambio es de =>> "
                        + montoConvertido + " " + divisaObjetivo);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        } else {
            System.out.println("No se pudo obtener la tasa de cambio para " + divisaBase + " a " + divisaObjetivo);
        }
    }
}
