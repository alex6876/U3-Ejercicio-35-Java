public class SillaErgonomica extends Mueble {

    private boolean ajusteAltura;
    private boolean soporteLumbar;

    public SillaErgonomica(String material, String color, double pesoKg,
                           boolean ajusteAltura, boolean soporteLumbar) {

        super(material, color, pesoKg);

        this.ajusteAltura = ajusteAltura;
        this.soporteLumbar = soporteLumbar;
    }

    @Override
    public double calcularCostoEnvio() {
        return super.calcularCostoEnvio() + 5000;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();

        System.out.println("Ajuste de altura: " + ajusteAltura);
        System.out.println("Soporte lumbar: " + soporteLumbar);
    }
}