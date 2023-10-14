import java.util.Scanner;

public class Nomina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float SMLV = 1160000;
        int subsidioTransporte = 0;
        float horasDiurnas = 1.25f;
        float horasNocturnas = 1.75f;
        float pensionTrabajador = 0.04f;
        float saludTrabajador = 0.04f;
        int diurnasTrabajadas;
        int nocturnasTrabajadas;

        //porcentajes retenciones en la fuente
        int retFuente1 = 0;
        float retFuente2 = 0.27f;
        float retFuente3 = 0.80f;
        float retFuente4 = 1.30f;
        float retFuente5 = 1.77f;
        float retFuente6 = 2.22f;
        int operacionFuente = 0;

        System.out.println("Por favor digite el numero de trabajadores de la nomina: ");
        int numeroTrabajadores = scanner.nextInt();

        for (int i = 1; i <= numeroTrabajadores; i++) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Por favor digite el nombre del trabajador " + i + ":");
            String nombreTrabajador = sc.nextLine();

            System.out.println("Por favor digite el cargo de " + nombreTrabajador);
            String cargoTrabajador = sc.nextLine();

            System.out.println("Por favor digite la dependecia de " + nombreTrabajador);
            String dependeciaTrabajador = sc.nextLine();

            System.out.println("Por favor digite el sueldo basico de " + nombreTrabajador);
            int sueldoBasico = sc.nextInt();

            System.out.println("Por favor digite los dias de trabajo de " + nombreTrabajador);
            int diasTrabajados = sc.nextInt();

            int basico = sueldoBasico * diasTrabajados / 30;

            int operacion = (int) (SMLV * 2);

            System.out.println(nombreTrabajador + " Por favor digite las horas diurnas trabajadas: ");
            diurnasTrabajadas = scanner.nextInt();
            if (diurnasTrabajadas >= 1) {
                int operacionDiurnas = (int) (basico / 240 * horasDiurnas * diurnasTrabajadas);


                System.out.println(nombreTrabajador + " Por favor digite las horas nocturnas trabajadas: ");
                nocturnasTrabajadas = scanner.nextInt();
                if (nocturnasTrabajadas >= 1) {
                    int operacionNocturnas = (int) (basico / 240 * horasNocturnas * nocturnasTrabajadas);


                    if (sueldoBasico > operacion) {
                        subsidioTransporte = 0;
                        System.out.println(nombreTrabajador + " no tiene derecho a subsidio de transporte, por lo tanto, equivale a: " + subsidioTransporte);
                    } else if (sueldoBasico < operacion) {
                        subsidioTransporte = 140606;
                    }


                    int operacion2 = basico + operacionDiurnas + operacionNocturnas + subsidioTransporte;

                    System.out.println(nombreTrabajador + " usted trabajo " + diasTrabajados + " dias, lo que le equivale a: " + basico);
                    System.out.println(nombreTrabajador + " usted trabajo " + diurnasTrabajadas + " horas diurnas, lo que le equivale a: " + operacionDiurnas);
                    System.out.println(nombreTrabajador + " usted trabajo " + nocturnasTrabajadas + " horas nocturnas, lo que le equivale a: " + operacionNocturnas);
                    System.out.println(nombreTrabajador + " usted tiene derecho al subsidio de transporte que equivale a: " + subsidioTransporte);
                    System.out.println("Total devengado sin deducciones: " + operacion2);

                    int operacionPension = (int) (operacion2 * pensionTrabajador);

                    int operacionSalud = (int) (operacion2 * saludTrabajador);

                    System.out.println(nombreTrabajador + " Se le realiza el descuento del pago de la pension, lo que equivale a: " + operacionPension);
                    System.out.println(nombreTrabajador + " Se le realiza el descuento del pago de la salud, lo que equivale a: " + operacionSalud);

                    if (sueldoBasico > 0 && sueldoBasico <= 1804003) {
                        System.out.println(retFuente1);
                    } else if (sueldoBasico >= 1804004 && sueldoBasico <= 1854000) {
                        operacionFuente = (int) ((sueldoBasico / 100) * retFuente2);
                        System.out.println(nombreTrabajador + " se le realiza el descuento de retencion de fuente, lo que equivale a: " + operacionFuente);
                    } else if (sueldoBasico >= 1854001 && sueldoBasico <= 1904000) {
                        operacionFuente = (int) ((sueldoBasico / 100) * retFuente3);
                        System.out.println(nombreTrabajador + " se le realiza el descuento de retencion de fuente, lo que equivale a: " + operacionFuente);
                    } else if (sueldoBasico >= 1904001 && sueldoBasico <= 1954000) {
                        operacionFuente = (int) ((sueldoBasico / 100) * retFuente4);
                        System.out.println(nombreTrabajador + " se le realiza el descuento de retencion de fuente, lo que equivale a: " + operacionFuente);
                    } else if (sueldoBasico >= 1954001 && sueldoBasico <= 2004000) {
                        operacionFuente = (int) (sueldoBasico / 100 * retFuente5);
                        System.out.println(nombreTrabajador + " se le realiza el descuento de retencion de fuente, lo que equivale a: " + operacionFuente);
                    } else if (sueldoBasico >= 2004001 && sueldoBasico <= 2054000) {
                        operacionFuente = (int) ((sueldoBasico / 100) * retFuente6);
                        System.out.println(nombreTrabajador + " se le realiza el descuento de retencion de fuente, lo que equivale a: " + operacionFuente);
                    } else {
                        System.out.println("El trabajador " + nombreTrabajador + " no se le descuenta retencion de fuente");
                    }
                    int valorNeto = (operacion2 - operacionPension - operacionSalud - operacionFuente);
                    System.out.println("Total valor Neto pagado al trabajador " + nombreTrabajador + " es: " + valorNeto);
                }
            }
        }
    }
}
