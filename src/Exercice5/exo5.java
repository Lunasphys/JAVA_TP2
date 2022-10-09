package src.Exercice5;

import src.Exercice1.Archimede;
import java.util.Scanner;
import src.Utils.utils;

public class exo5 {
    public static void main(String[] args) {
        System.out.println("Entrer votre pseudo");
        Scanner pseudo = new Scanner(System.in);
        System.out.println("Bienvenue " + pseudo + " !");
        System.out.println("Avant de commencer la partie, avec combien d'allumettes souhaitez vous jouer ? (Minima de 16 allumettes)");
        int nbAllumettes = utils.entierInt();
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
