package ZOOLOGICO;

public class Serpiente extends Reptil {

    public Serpiente(String nombre, String habitat, int edad) {
        super(nombre, habitat, edad);
    }

    @Override
    public void actividadDiaria() {
        System.out.println(nombre + " se arrastra por el terrario buscando calor y escondites.");
    }

    @Override
    public void limpiarHabitat() {
        System.out.println("Se reemplaza y desinfecta la cama/sustrato del hábitat de la serpiente " + nombre + ".");
    }
}
