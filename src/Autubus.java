public class Autubus extends Vehiculos {

    private int numAsientos;

    private int numPuertas;

    private int numVentilas;

    public Autubus(int numAsientos, int numPuertas, int numVentilas, int precioDia1, String marcaModelo1, int numllantas1) {
        super(precioDia1, marcaModelo1, numllantas1);
        this.numAsientos = numAsientos;
        this.numPuertas = numPuertas;
        this.numVentilas = numVentilas;
        System.out.println("Se ha armado el autobus");
    }
    
    
    public void mostrarDatos(){
        super.MostrarCaracteristicas();
         System.out.println("El numero de asientos es: "+numAsientos);
         System.out.println("El numero de puertas es: "+numPuertas);
         System.out.println("El numero de ventilas es: "+numVentilas);
    }
    //se crea metodo simple mostrar status  del motor
    public void encendermotor(){
        //por medio del super se esta llamando a los metodos de la clase padre
        super.encendido();
        super.apagarmotor();
        super.funcion();
    }
    }

    

