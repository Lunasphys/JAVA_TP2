package src.Exercice5;

import java.util.Scanner;
import java.util.Random;

import src.Menu;
import src.Utils.utils;

import static src.Utils.utils.*;

/**
 * @author : Jeham Laurie
 * @author : Maxime Obry
 * Class de l'exercice 5
 * La règle : il y a plusieurs allumettes ( supérieur ou égales à 16 ) et on en retire 1,2 ou 3 et celui qui prend la dernière a gagné. Vous jouer contre l’ordinateur
 * Le joueur de départ est choisi aléatoirement
 * (Remarque ;si l’ordinateur est le deuxième joueur il doit normalement gagner )
 */
public class exo5 {
    /**
     * Fonction principale de l'exercice 5
     *
     * @param args Parametre de la ligne de commande(non utilisé)
     */
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
        int turn = src.Utils.utils.getRandomNumber(1, 3);
        System.out.println("C'est le chiffre " + turn + " qui commence");

            while (nbAllumettes > 0) {
                if (turn % 2 != 0) {
                    System.out.println("A vous de jouer");
                    System.out.println("Il reste " + nbAllumettes + " allumettes");
                    System.out.println("Combien d'allumettes souhaitez vous retirer ? (1, 2 ou 3)");
                    int nbRetirer = entierInt2(nbAllumettes);
                    nbAllumettes = nbAllumettes - nbRetirer;
                    turn += 1;
                    System.out.println("Il reste " + nbAllumettes + " allumettes");
                }
                    else if(turn % 2 == 0) {
                    // l'ordinateur doit jouer et doit laisser au joueur un nombre d'allumettes qui sera un multiple de 4
                    System.out.println("A l'ordinateur de jouer");
                    int nbAllumettesRetireesOrdi;
                    if (nbAllumettes % 4 == 0) {
                        System.out.println("L'ordinateur retire 3 allumettes");
                        nbAllumettes -= 3;
                    } else if (nbAllumettes % 4 == 3) {
                        System.out.println("L'ordinateur retire 2 allumette");
                        nbAllumettes -= 2;
                    } else if (nbAllumettes % 4 == 2) {
                        System.out.println("L'ordinateur retire 1 allumettes");
                        nbAllumettes -= 1;
                    } else {
                        Random rand = new Random();
                        nbAllumettesRetireesOrdi = rand.nextInt(3) + 1;
                        nbAllumettes -= nbAllumettesRetireesOrdi;
                        System.out.println("L'ordinateur retire " + nbAllumettesRetireesOrdi + "allumettes");
                    }
                    turn += 1;

                }
                }
                if (nbAllumettes == 0){
                    if(turn % 2 == 0){
                        System.out.println("Vous avez perdu");
                        Menu.main(args);
                    }else{
                        System.out.println("Vous avez gagné");
                        Menu.main(args);
                    }
                }
            }

        }





