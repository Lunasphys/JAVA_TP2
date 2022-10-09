package src.Exercice1;

import java.awt.*;
import java.util.Scanner;




import static src.Utils.utils.isDouble;


/**
 * @author : Jeham Laurie
 * Méthode Cn de la classe Archimede
 * Methode qui effectue le calcul d'une racine carreen prenant en compte un double
 *
 */

public class Archimede {

    public static double Cn(double x, double y) {

        double Cn = 2 * x * y / (x + y);
        if (x < 0 || y < 0) {
            System.out.println("X et Y doivent être positifs");
        } else {

            System.out.println("La valeur de Cn est : " + Cn);
        }
        return Cn;
    }

    public static double In(double x, double y) {
        double In = Math.sqrt(x * y);
        if (x < 0 || y < 0) {
            System.out.println("X et Y doivent être positifs");
        } else {

            System.out.println("La valeur de In est : " + In);
        }
        return In;
    }
}

