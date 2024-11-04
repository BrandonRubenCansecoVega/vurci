public class moto extends Vehiculos {
//se declara variables
    private int numAsientos=1;

    public moto(int precioDia, String marcaModelo, int numllantas,int asientos) {
        super(precioDia, marcaModelo, numllantas);
        System.out.println("ha creado una motocicleta");
        numAsientos = asientos;
        
    }
    public void mostrarDatos(){
        super.MostrarCaracteristicas();
         System.out.println("El numero de asientos es: "+numAsientos);
    }
    //se crea metodo simple mostrar status  del motor
    public void encendermotor(){
        super.encendido();
        super.apagarmotor();
        super.funcion();
    }
}

