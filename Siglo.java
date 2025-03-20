/*
 * Autores
 * Kender Adolfo Bolivar Trespalacios
 */
import java.util.Scanner;

public class Siglo {
    public static void main(String[] args) {
        // Se solicita el año al usuario
        int year = scanYear();

        // Se valida que el año sea mayor a 0
        if (year < 1) {
            System.out.println("El año no es valido..");
            return;
        }

        int numeroDeSiglo = siglo( year );
        int numeroprimer_anho = primer_anho( numeroDeSiglo );

        //  Se imprimen los resultados
        System.out.println( "El numero del siglo es: " + numeroDeSiglo );
        System.out.println( "El numero del primer año es: " + numeroprimer_anho );
    }
    
    // Se calcula el siglo
    public static int siglo( int year ) {
        return (int)  Math.ceil(year /100.0);
    }
    
    // Se calcula el primer año del siglo
    public static int primer_anho( int siglo ) {
        return (siglo - 1) * 100 + 1;
    }

    // Se solicita el año al usuario
    public static int scanYear() {
        int year = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el año: ");
        String input = scanner.nextLine();
        scanner.close();

        // Se valida que el año sea un número entero
        try {
            year = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return year;
        }

        return year;
    }
}
