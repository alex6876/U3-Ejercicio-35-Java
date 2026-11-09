public class ArchivoRodante extends Mueble {

    private int cantidadGavetas;
    private boolean sistemaSeguridad;

    public ArchivoRodante(String material, String color, double pesoKg,
                          int cantidadGavetas, boolean sistemaSeguridad) {

        super(material, color, pesoKg);

        this.cantidadGavetas = cantidadGavetas;
        this.sistemaSeguridad = sistemaSeguridad;
    }

    @Override
    public double calcularCostoEnvio() {
        return super.calcularCostoEnvio() + 7000;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();

        System.out.println("Cantidad de gavetas: " + cantidadGavetas);
        System.out.println("Sistema de seguridad: " + sistemaSeguridad);
    }
}