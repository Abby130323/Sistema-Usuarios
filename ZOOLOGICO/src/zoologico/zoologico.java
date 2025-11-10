package ZOOLOGICO;

public class zoologico {
    public static void main(String[] args) {

        // 🐾 Lista de animales
        Animal[] animales = {
            new Leon("Simba", "Sabana Africana", 6),
            new Elefante("Dumbo", "Pradera húmeda", 10),
            new Tigre("Shere Khan", "Selva Asiática", 7),
            new Cocodrilo("Rex", "Pantano tropical", 12),
            new Iguana("Iggy", "Terrario de selva", 4),
            new Serpiente("Kaa", "Terrario desértico", 5)
        };

        // 👥 Usuarios
        Administrador admin = new Administrador("Laura", 1001);
        Trabajador cuidador = new Trabajador("Jairo", 2001);

        System.out.println("\n=== USUARIOS DEL SISTEMA ===");
        admin.mostrarFunciones();
        cuidador.mostrarFunciones();

        System.out.println("\n=== INTERACCION DE USUARIOS ===");
        admin.verAnimales(animales);
        cuidador.verAnimales(animales);

        admin.agregarAnimal(new Leon("Nala", "Sabana Africana", 4));
        admin.verReportes();

        cuidador.alimentarAnimal(animales[1]);  // Dumbo
        cuidador.limpiarHabitat(animales[3]);   // Rex

        admin.registrarActividad(animales[0]);  // Simba
        cuidador.registrarActividad(animales[2]); // Shere Khan
    }
}
