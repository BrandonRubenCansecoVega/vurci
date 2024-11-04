public class Vehiculos {    
    protected int precioDia;
    
    protected String marcaModelo;
    
    protected int numllantas;

    public Vehiculos() {
       
    }

    public Vehiculos(int precioDia1, String marcaModelo1, int numllantas1) {
        this.precioDia = precioDia1;
        this.marcaModelo = marcaModelo1;
        this.numllantas = numllantas1;
        System.out.println("Vehiculo al fallo");
    }
    //se desarrolla metodo propio que solo retorna/recupera el valor
    public void MostrarCaracteristicas(){
        System.out.println("Marca del automovil"+marcaModelo);
        System.out.println("Precio de las llantas"+numllantas);
        System.out.println("precio del automovil al dia"+precioDia);
    }
    //se crean metodos propios para mostrar mensaje respecto al estatus del auto
    //tales como:encendido,apagado,estacionado
    public void encendido(){
        System.out.println("El motor esta encendido");
    }
     public void apagarmotor(){
         System.out.println("El vehiculo esta apagado");
     }
     public void funcion(){
         System.out.println("El vehiculo esta funcionando");
         System.out.println("El motor de la marca: "+marcaModelo+"funciona correctamente");
     }
}
