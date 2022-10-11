package src.Exercice2;

import src.Exercice1.Archimede;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * @author : Jeham Laurie
 * Class de l'exercice 1
 * Cet exercice est la continuation de l'exercice 1 et permet de calculer la valeur de Cn et In pendant une boucle
 * de N tours, puis en les integrant dans un tableau
 */

public class exo2 {
    /**
     * Fonction principale de l'exercice 3
     *
     * @param args Parametre de la ligne de commande(non utilisé)
     */
    public static void main(String[] args) {
        System.out.println("Veuillez entrer la valeur n qui definira le nombre de loop effectue :");
        int n = src.Utils.utils.entierInt();
        System.out.println("Le programme va se lancer...");
        An(n);
    }

    /**
     * Il prend un nombre n et renvoie un tableau de longueur 2n+2 contenant les n+1 premières paires de nombres (x, y) de
     * la séquence
     *
     * @param n le nombre d'itérations
     * @return Un tableau de doubles.
     */
    public static double[] An(int n) {
        double x = 4;
        double y = 2*Math.sqrt(2);
        double[] tab = new double[] {x, y};
        int i = 1;
        while (i <= n) {
            x = Archimede.Cn(x, y);
            y = Archimede.In(x, y);
            tab = Arrays.copyOf(tab, tab.length + 2);
            tab[tab.length - 2] = x;
            tab[tab.length - 1] = y;
            i++;
        }
        System.out.println(Arrays.toString(tab));
        return tab;
    }
}



