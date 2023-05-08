package objects;

public class ejercicio_final {
    public static void main(String[] args){
        Trabajador ope = new Trabajador();
        ope.edad1 = 18;
        ope.telefono = 3124684;
        ope.nombre1 = "Jhojan";
        ope.credito = 1000;
        ope.salario = 1000;
        System.out.println("Nombre del cliente: " + ope.nombre1 + "\n " +
                            "Edad: " + ope.edad1 + "\n " +
                            "Telefono: " + ope.telefono + "\n " +
                            "Credito: " + ope.credito);
        System.out.println("El salario es: " + ope.getSalario());
    }
}

abstract class Persona1{
    int edad1;
    String nombre1;
    int telefono;

}

class Cliente extends Persona1{
    int credito;
}

class Trabajador extends Cliente{
    int salario;

    public void setSalario(int salario){
        this.salario = salario;
    }
    public int getSalario(){
        return this.salario;
    }
}
