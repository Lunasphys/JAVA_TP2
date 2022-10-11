package src.Exercice1;

import java.awt.*;
import java.util.Scanner;




import static src.Utils.utils.isDouble;


/**
 * Class d'archimede de l'exercice
 * @author : Jeham Laurie
 */

public class Archimede {
    /**
     * La fonction Cn prend deux valeurs doubles en paramètres et retourne une valeur double
     *
     * @param x le nombre de succès dans le premier échantillon
     * @param y Le nombre de réussites dans l'échantillon.
     * @return La valeur de Cn
     */
    public static double Cn(double x, double y) {

        double Cn = 2 * x * y / (x + y);
        if (x < 0 || y < 0) {
            System.out.println("X et Y doivent être positifs");
        } else {

            System.out.println("La valeur de Cn est : " + Cn);
        }
        return Cn;
    }

    /**
     * Il calcule la racine carrée de x * y.
     *
     * @param x Le premier numéro sur lequel exécuter cette fonction.
     * @param y La coordonnée y du point.
     * @return La valeur de In est renvoyée.
     */
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

