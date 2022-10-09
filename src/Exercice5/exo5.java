package src.Exercice5;

import src.Exercice1.Archimede;
import java.util.Scanner;
import src.Utils.utils;

public class exo5 {
    public static void main(String[] args) {
        System.out.println("Entrer votre pseudo");
        Scanner scan = new Scanner(System.in);
        String pseudo = scan.nextLine();
        System.out.println("Bienvenue " + pseudo + " !");
        System.out.println("Avant de commencer la partie, avec combien d'allumettes souhaitez vous jouer ? (Minima de 16 allumettes)");
        int nbAllumettes = utils.entierInt();
        if (nbAllumettes < 16) {
            System.out.println("Vous devez jouer avec au moins 16 allumettes");
            System.exit(0);
        }
        System.out.println("Vous avez choisi de jouer avec " + nbAllumettes + " allumettes");
        System.out.println("Tout d'abord, nous allons déterminer aléatoirement qui commence");
        int random = (int) (Math.random() * 2);
        if (random == 0) {
            System.out.println("Vous commencez");
        } else {
            System.out.println("L'ordinateur commence");
        }
        System.out.println("Vous pouvez retirer 1, 2 ou 3 allumettes. Le dernier joueur à retirer une allumette perd la partie");
        System.out.println("C'est parti !");
        int nbAllumettesRestantes = nbAllumettes;
    }
}
