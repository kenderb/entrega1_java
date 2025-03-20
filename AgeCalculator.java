/*
 * Autores
 * Kender Adolfo Bolivar Trespalacios
 */
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        int year = scanYear();

      if (year < 1) {
        System.out.println("El año no es valido..");
        return;
      }

      int numero_de_siglo = siglo( year );
      int numero_primer_anho = primerAnho( numero_de_siglo );

      System.out.println( "El numero del siglo es: " + numero_de_siglo );
      System.out.println( "El numero del primer año es: " + numero_primer_anho );
    }
    
    public static int siglo( int year ) {
        return (int)  Math.ceil(year /100.0);
    }
    
    public static int primerAnho( int siglo ) {
        return (siglo - 1) * 100 + 1;
    }

    public static int scanYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el año: ");
        int year = scanner.nextInt();
        scanner.close();

        return year;
    }
}

