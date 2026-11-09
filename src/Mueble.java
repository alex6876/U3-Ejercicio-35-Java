public class Mueble {

    protected String material;
    protected String color;
    protected double pesoKg;

    public Mueble(String material, String color, double pesoKg) {
        this.material = material;
        this.color = color;
        this.pesoKg = pesoKg;
    }

    public double calcularCostoEnvio() {
        return pesoKg * 1000;
    }

    public void mostrarInformacion() {
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Peso: " + pesoKg + " kg");
    }
}