package ejercicio.dependencia.impresora;

public class impresora {
    private boolean ON;
    
    public impresora(){
        ON = false;
    }

    public void encender(){
        ON = true;
        System.out.println("Impresora ON");
    }
    public void apagar(){
        ON = false;
        System.out.println("Impresora OFF");
    }
    public void imprimir(Documento doc){
        if (ON){
            System.out.println("imprimiendo DOCUMENTO");
            System.out.println("Titulo : " + doc.getTitulo());
            System.out.println("Cuerpo : " + doc.getCuerpo());
        }else{
            System.out.println("Impresora OFF, imposible imprimir");
        }
        if (doc.getTitulo()== null || doc.getTitulo().isEmpty()){
            System.out.println("el titulo esta vacio, no puedo imprimir");
            System.out.println("deteniendo impresora");
            return;
        }
        
        if (doc.getCuerpo() == null || doc.getCuerpo().isEmpty())
            System.out.println("el cuerpo esta vacio, no puedo imprimir");
            System.out.println("deteniendo impresora");
            return;
    }
    
}
