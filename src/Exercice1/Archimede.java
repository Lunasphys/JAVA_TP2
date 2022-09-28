package src.Exercice1;

import java.awt.*;
import java.util.Scanner;



import static src.Utils.utils.isDouble;


/**
 * @author : Jeham Laurie
 * Méthode Cn de la classe Archimede
 *
 *
 *
 *
 */

public class Archimede {

    public static void Cn() {
        System.out.println("Entrer un double positif");
        double x = isDouble(); // Regarde si l'input est bien un double positif
        double y = isDouble();

        if (x < 0 || y < 0) {
            System.out.println("X et Y doivent être positifs");
        } else {
            double Cn = 2 * x * y / (x + y);
            System.out.println("La valeur de Cn est : " + Cn);
        }
    }

    public static void In() {
        System.out.println("Vous vous appretez à rentrer deux doubles positifs");
        System.out.println("Entrez le premier double");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        double x = isDouble(); // Regarde si l'input est bien un double positif
        System.out.println("Entrez le deuxieme double");
        double y = isDouble();
        if (x < 0 || y < 0) {
            System.out.println("X et Y doivent être positifs");
        } else {
            double In = Math.sqrt(x * y);
            System.out.println("La valeur de In est : " + In);
        }
    }
}

