package proyecto.sena.abstracción.src;

public abstract class Figura {
    public abstract double calcularArea();

    public void mostrarTipo() {
        System.out.println("Soy una figura geométrica.");
    }
}