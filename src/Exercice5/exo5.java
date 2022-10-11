package src.Exercice5;

import src.Exercice1.Archimede;
import java.util.Scanner;
import java.util.Random;
import src.Utils.utils;
/**
 * @author : Jeham Laurie
 * Class de l'exercice 5
 * La règle : il y a plusieurs allumettes ( supérieur ou égales à 16 ) et on en retire 1,2 ou 3 et celui qui prend la dernière a gagné. Vous jouer contre l’ordinateur
 * Le joueur de départ est choisi aléatoirement
 * (Remarque ;si l’ordinateur est le deuxième joueur il doit normalement gagner )
 */
public class exo5 {
    public static void main(String[] args) {
        System.out.println("Entrer votre pseudo");
        Scanner scan = new Scanner(System.in);
        String pseudo = scan.nextLine();
        System.out.println("Bienvenue " + pseudo + " !");
        System.out.println("Avant de commencer la partie, avec combien d'allumettes souhaitez vous jouer ? (Minima de 16 allumettes)");
        Scanner scan2 = new Scanner(System.in);
        int nbAllumettes = scan2.nextInt();
        if (nbAllumettes < 16) {
            System.out.println("Vous devez jouer avec au moins 16 allumettes");
            scan2.nextInt();
        } else {
            System.out.println("Vous avez choisi de jouer avec " + nbAllumettes + " allumettes");
            System.out.println("Le joueur qui commence est choisi aléatoirement (1 pour vous, 2 pour l'ordinateur)");
            int whoPlay = src.Utils.utils.getRandomNumber(1, 3);
            System.out.println("C'est le chiffre " + whoPlay + " qui commence");
            if (whoPlay == 1) {
                System.out.println("Vous commencez");
                while (nbAllumettes > 0) {
                    System.out.println("Il reste " + nbAllumettes + " allumettes");
                    System.out.println("Combien d'allumettes souhaitez vous retirer ? (1, 2 ou 3)");
                    Scanner scan3 = new Scanner(System.in);
                    int nbRetirer = scan3.nextInt();
                    if (nbRetirer > 3 || nbRetirer < 1) {
                        System.out.println("Vous ne pouvez retirer que 1, 2 ou 3 allumettes");
                        nbRetirer = scan.nextInt();
                    } else if (nbRetirer > nbAllumettes-1) {
                        System.out.println("Vous ne pouvez pas retirer plus d'allumettes que ce qu'il y en a");
                        nbRetirer = scan.nextInt();
                    } else {
                        nbAllumettes = nbAllumettes - nbRetirer;
                        if (nbAllumettes == 1) {
                            System.out.println("Vous avez gagné !");
                            break;
                        }
                        System.out.println("Il reste " + nbAllumettes + " allumettes");
                        Random rand = new Random();
                        int nbAllumettesRetireesOrdi = rand.nextInt(3) + 1;
                        if (nbAllumettes > 3) {
                            System.out.println("L'ordinateur retire " + nbAllumettesRetireesOrdi + " allumettes");
                            nbAllumettes = nbAllumettes - nbAllumettesRetireesOrdi;
                        } else if (nbAllumettes == 3) {
                            nbAllumettesRetireesOrdi = 2;
                            System.out.println("L'ordinateur retire " + nbAllumettesRetireesOrdi + " allumettes");
                            System.out.println("Vous avez perdu !");
                            break;
                        } else if (nbAllumettes == 2) {
                            nbAllumettesRetireesOrdi = 1;
                            System.out.println("L'ordinateur retire " + nbAllumettesRetireesOrdi + " allumettes");
                            System.out.println("Vous avez perdu !");
                            break;
                        } else if (nbAllumettes == 1) {
                            System.out.println("L'ordinateur retire " + nbAllumettesRetireesOrdi + " allumettes");
                            System.out.println("Vous avez perdu !");
                            break;
                        }
                    }
                }

            }
        }
    }


}
