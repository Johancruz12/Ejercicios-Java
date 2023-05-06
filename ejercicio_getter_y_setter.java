package objects;

public class ejercicio_getter_y_setter {
    //estructura inicial de Java
    public static void main(String[] args){
        //se crea el objeto coche y se llama la clase Vehiculo2
        Vehiculo2 coche = new Vehiculo2();
        //se crea lo que se va a enviar por el metodo set
        coche.setTipo("Coupe");
        //se imprime lo que se recibe desde la clase set, el cual se recibe por el metodo get
        System.out.println(coche.getTipo());


        //se crea el objeto coche2 y se llama la clase Vehiculo2
        Vehiculo2 coche2 = new Vehiculo2();
        //se crea lo que se va a enviar por el metodo set
        coche2.setvelocidadMaxima(12.12f);
        //se imprime lo que se envio desde el metodo set, el cual se recibe por el metodo get
        System.out.println(coche2.getvelocidadMaxima());
    }
}
//se crea la clase Vehiculo2
class Vehiculo2 {
    //se crea una variable privada de tipo String
    private String tipo;
    //se crea una variable privada de tipo float
    private float velocidadMaxima;

    //se crea el metodo set el cual va a enviar los datos hacia el metodo get
    public void setvelocidadMaxima(float velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    //se crea el metodo get el cual va a recibir los datos que se enviaron desde el metodo set
    public float getvelocidadMaxima(){
        return this.velocidadMaxima;
    }
    //se crea el metodo set el cual va a enviar los datos hacia el metodo get
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    //se crea el metodo get el cual va a recibir los datos que se enviaron desde el metodo set
    public String getTipo(){
        return this.tipo;
        }
    }

