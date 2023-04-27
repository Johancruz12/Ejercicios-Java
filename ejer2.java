public class ejer2 {
    //estructura java
    public static void main(String[] args) {
        //se crea el objeto Object
        Coche Object = new Coche();
        //Se inicializa el objeto y se agrega la funcion con la cual se va a incrementar
        Object.AgregarPuertas();
        //se imprime el objeto y la variable puertas Object.Puertas
        System.out.println("El objeto tiene: " + Object.Puertas + " puertas");
    }
}
//se crea la clase Coche
class Coche {
    //se crea la variable puertas
    public int Puertas = 4;
    //se crea la funcion puertas la cual se llamo AgregarPuertas()
    public void AgregarPuertas() {
        //por ultimo, se crea el incrementador que depende del numero de la variable va a incrementar
        this.Puertas++;
    }
}
