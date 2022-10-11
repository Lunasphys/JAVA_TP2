package src.Exercice5;

import java.util.Scanner;
import java.util.Random;
import src.Utils.utils;

import static src.Utils.utils.entierInt;
import static src.Utils.utils.isString;

/**
 * @author : Jeham Laurie
 * Class de l'exercice 5
 * La règle : il y a plusieurs allumettes ( supérieur ou égales à 16 ) et on en retire 1,2 ou 3 et celui qui prend la dernière a gagné. Vous jouer contre l’ordinateur
 * Le joueur de départ est choisi aléatoirement
 * (Remarque ;si l’ordinateur est le deuxième joueur il doit normalement gagner )
 */
public class exo5 {
    public static void main(String[] args) {
        System.out.println("-----Exercice 5 -----");
        System.out.println("Entrer votre pseudo");
        String pseudo = isString();
        System.out.println("Bienvenue " + pseudo + " !");
        System.out.println("Avant de commencer la partie, avec combien d'allumettes souhaitez vous jouer ? (Minima de 16 allumettes)");
        int nbAllumettes = entierInt();;
        while (nbAllumettes < 16) {
            System.out.println("Vous devez jouer avec au moins 16 allumettes");
            nbAllumettes = entierInt();
        }
        System.out.println("Vous avez choisi de jouer avec " + nbAllumettes + " allumettes");
        System.out.println("Le joueur qui commence est choisi aléatoirement (1 pour vous, 2 pour l'ordinateur)");
        int whoPlay = src.Utils.utils.getRandomNumber(1, 2);
        System.out.println("C'est le chiffre " + whoPlay + " qui commence");
        if (whoPlay == 1) {
            System.out.println("Vous commencez");
            while (nbAllumettes > 0) {
                System.out.println("Il reste " + nbAllumettes + " allumettes");
                System.out.println("Combien d'allumettes souhaitez vous retirer ? (1, 2 ou 3)");
                int nbRetirer = entierInt();
                if (nbRetirer > 3 || nbRetirer < 1) {
                    System.out.println("Vous ne pouvez retirer que 1, 2 ou 3 allumettes");
                    nbRetirer = entierInt();
                } else if (nbRetirer > nbAllumettes-1) {
                    System.out.println("Vous ne pouvez pas retirer plus d'allumettes que ce qu'il y en a");
                    nbRetirer = entierInt();
                } else {
                    nbAllumettes = nbAllumettes - nbRetirer;
                    if (nbAllumettes == 1) {
                        System.out.println("Vous avez gagné !");
                        break;
                    }
                    System.out.println("Il reste " + nbAllumettes + " allumettes");
                    // l'ordinateur doit jouer et doit laisser au joueur un nombre d'allumettes qui sera un multiple de 4
                    Random rand = new Random();
                    int nbAllumettesRetireesOrdi ;
                    if (nbAllumettes % 4 == 3){
                        System.out.println("L'ordinateur retire 3 allumettes");
                        nbAllumettes -= 3;
                    }
                    else if (nbAllumettes % 4 == 2){
                        System.out.println("L'ordinateur retire 2 allumettes");
                        nbAllumettes -= 2;
                    }
                    else if (nbAllumettes % 4 == 1){
                        System.out.println("L'ordinateur retire 1 allumettes");
                        nbAllumettes -= 1;
                    }
                    else {
                        nbAllumettesRetireesOrdi = rand.nextInt(3) + 1;
                        nbAllumettes -= nbAllumettesRetireesOrdi;

                    }

                }
            }

        }
    }
}



