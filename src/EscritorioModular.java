public class EscritorioModular extends Mueble {

    private double superficieM2;
    private int cantidadCajoneras;

    public EscritorioModular(String material, String color, double pesoKg,
                             double superficieM2, int cantidadCajoneras) {

        super(material, color, pesoKg);

        this.superficieM2 = superficieM2;
        this.cantidadCajoneras = cantidadCajoneras;
    }

    @Override
    public double calcularCostoEnvio() {
        return super.calcularCostoEnvio() + 10000;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();

        System.out.println("Superficie: " + superficieM2 + " m2");
        System.out.println("Cantidad de cajoneras: " + cantidadCajoneras);
    }
}