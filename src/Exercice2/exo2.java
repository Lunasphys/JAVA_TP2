package src.Exercice2;

import src.Exercice1.Archimede;

import java.sql.SQLOutput;
import java.util.Arrays;

public class exo2 {

    public static void main(String[] args) {
        System.out.println("Veuillez entrer la valeur n qui definira le nombre de loop effectue :");
        int n = src.Utils.utils.entierInt();
        System.out.println("Le programme va se lancer...");
        An(n);
    }
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



