
// Comentario añadido de prueba añadido
// IES JUAN DE LA CIERVA DAM1D PATRICIA E ISABEL

//Este es otro comentario de prueba
package pruebapersona;

public class Persona {

    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void saludar() {
        System.out.println("Hola, me llamo " + nombre);
    }

    public void cumplirAnios() {
        edad++;
    }
}