public class ejercicio_switch {
    public static void main(String[] args){
        String estacion = "Primavera";

        switch (estacion){
            case "Primavera":
                System.out.println("La estacion es: " + estacion);
                break;
            case "Otoño":
                System.out.println("La estacion es: " + estacion);
                break;
            case "Invierno":
                System.out.println("La estacion es: " + estacion);
            break;
            case "Verano":
                System.out.println("La estacion es " + estacion);
            break;
            default:
                System.out.println("El valor de la estacion no existe");
        }
    }
}
