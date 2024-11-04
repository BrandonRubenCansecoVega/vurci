public class Automovil extends Vehiculos {

    private int numasientos=5;

    private int numpuertas;
    
    public Automovil(int puertas, int precioDia1, String marcaModelo1, int numllantas1,int asientos) {
        super(precioDia1, marcaModelo1, numllantas1);
        this.numpuertas = puertas;
        this.numasientos = asientos;
        System.out.println("Se a terminado el auto");
    }
    //metodos 
    public void mostrarDatos(){
        super.MostrarCaracteristicas();
        System.out.println("El numero de asientos es: "+numasientos);
        System.out.println("El numero de puertas es: "+numpuertas);
    }
    //se crea metodo simple/de metodo, para validar estatus del mot
    public void encendermotor(){
        super.encendido();
        super.apagarmotor();
        super.funcion();
    }
    public Automovil() {
    }
}
