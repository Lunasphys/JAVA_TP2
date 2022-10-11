package src;

import src.Utils.utils;

import java.util.Scanner;


/**
 * @author : Obry Maxime and Jeham Laurie
 * Class pour créer le menu
*/
public class Menu {

    /**
     * Fonction principale du menu
     * @param args Parametre de la ligne de commande(non utilisé)
*/
    public static void main(String[] args) {
        System.out.println("======== Bonjour, choisissez un exercice ========");
        System.out.println("****************************");
        System.out.println("======== Exercice 1 : Methode d'Archimede 1/2 ========");
        System.out.println("======== Exercice 2 : Methode d'Archimede 2/2 =============");
        System.out.println("======== Exercice 3 : Impots ============");
        System.out.println("======== Exercice 4 : Chance Euromillions =====================");
        System.out.println("======== Exercice 5 : Jeu de Nim =====================");
        System.out.println("Quel exercice souhaitez-vous faire ?");
        int value = utils.entierInt();
        while (true) {
            switch (value) {
                case 1:
                    src.Exercice1.exo1.main(args);
                    Menu.main(args);
                    break;
                case 2:
                    src.Exercice2.exo2.main(args);
                    Menu.main(args);
                    break;
                case 3:
                    src.Exercice3.exo3.main(args);
                    Menu.main(args);
                    break;
                case 4:
                    src.Exercice4.exo4.main(args);
                    Menu.main(args);
                    break;
                case 5:
                    src.Exercice5.exo5.main(args);
                    Menu.main(args);
                    break;
            }
            System.out.println("Veuillez entrer un nombre entre 1 et 5");
            Menu.main(args);
            break;
        }

    }
}
