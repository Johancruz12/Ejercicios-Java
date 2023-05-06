package objects;

public class ejercicio_encapsulacion {
    public static void main(String[] args){
        Persona datos = new Persona();
        datos.setEdad(18);;
        datos.setNombre("Jhojan");
        datos.setTel(3124684627f);
        System.out.println(datos.getEdad());
        System.out.println(datos.getNombre());
        System.out.println(datos.getTel());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private float tel;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
        }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setTel(float tel){
        this.tel = tel;
    }
    public float getTel(){
        return this.tel;
    }
}