package ejercicio.dependencia.impresora;

public class EjercicioDependenciaImpresora {

    public static void main(String[] args) {
             
       impresora impresora= new impresora();
       impresora.encender();
       
             
       Documento documento1 = new Documento("Parciales ing. software","impresion de los parciales");
       validar(impresora, documento1);
       
       Documento documento2 = new Documento("","impresiones por nombre y cedula estudiantes");
       validar(impresora, documento2);
       
       Documento documento3 = new Documento("Examenes quimica","");
       validar(impresora, documento3);
       
       impresora.apagar();
       
    }
    
    private static  void validar(impresora impresora,Documento doc){
        boolean titulovacio = doc.getTitulo() == null || doc.getTitulo().isEmpty();
        boolean cuerpovacio = doc.getCuerpo() == null || doc.getCuerpo().isEmpty();
        
        if (titulovacio && cuerpovacio){
            System.out.println("no puedo imprimir , el titulo y el cuerpo estan vacios");
        }else if(titulovacio){
            System.out.println("no puedo imprimir, el titulo esta vacio");
        }else if(cuerpovacio){
            System.out.println("no puedo imprimir, el cuerpo esta vacio");
    }else{
            impresora.imprimir(doc);
        }
    }
    
    
    
}
