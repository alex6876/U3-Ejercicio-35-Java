public class Main {

    public static void main(String[] args) {

        SillaErgonomica silla = new SillaErgonomica(
                "Metal y tela", "Negro", 15,
                true, true
        );

        EscritorioModular escritorio = new EscritorioModular(
                "Madera", "Marron", 40,
                2.5, 3
        );

        ArchivoRodante archivo = new ArchivoRodante(
                "Metal", "Gris", 60,
                5, true
        );

        Mueble[] muebles = {
                silla,
                escritorio,
                archivo
        };

        System.out.println("===== REPORTE DE MOBILIARIO =====");

        for (Mueble mueble : muebles) {

            System.out.println("\n------------------------------");

            mueble.mostrarInformacion();

            System.out.println("Costo de envio: $"
                    + mueble.calcularCostoEnvio());
        }
    }
}