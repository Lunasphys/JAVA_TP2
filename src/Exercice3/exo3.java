package src.Exercice3;

import java.util.Scanner;

import static src.Utils.utils.entierInt;

/**
 * @author : Obry Maxime
 * Class de l'exercice 3
 * Cet exercice permet de calculer ses impots en fonction de son revenu et de sa situation familiale
 */
public class exo3 {
    /**
     * Fonction principale de l'exercice 3
     *
     * @param args Parametre de la ligne de commande(non utilisé)
     */
        public static void main(String[] args) {
            System.out.println("Bonjour dans le calculateur d'impots");
            System.out.println("Veuillez entrer votre revenu annuel");
            int revenu = entierInt();
            System.out.println("Maintenant etes vous celibataire ou marié et avez vous des enfants?");
            System.out.println("1 pour celibataire sans enfants, 2 pour marié sans enfants, 3 pour marié avec enfants, 4 pour celibataire avec enfants");
            int statut = entierInt();
            if (statut == 1) {
                double impots = MesImpots(revenu);
                System.out.println("Vous devez payer " + impots + " d'impots");
            } else if (statut == 2 ) {
                double impots = MesImpots(revenu);
                double result = impots * 2;
                System.out.println("Vous devez payer " + result + " d'impots");
            } else if (statut == 3) {
                double impots = MesImpots(revenu);
                System.out.println("Combien d'enfants avez vous?");
                int nbEnfants = entierInt();
                double result = impots * 2 - nbEnfants * 500;
                System.out.println("Vous devez payer " + result + " d'impots");
            } else if (statut == 4) {
                double impots = MesImpots(revenu);
                System.out.println("Combien d'enfants avez vous?");
                int nbEnfants = entierInt();
                double result = impots - nbEnfants * 500;
                System.out.println("Vous devez payer " + result + " d'impots");
            } else {
                System.out.println("Vous n'avez pas entré un statut valide");
            }

        };

    /**
     * @para Methode qui calcule les impots en fonction du revenu
     * gains = valeur pris en parametre pour calculer les impots
     * @return le montant des impots
     */
        public static double MesImpots(double gains){
            double impots = 0;
            if (gains < 10225) {
                impots = 0;
            } else if (gains >= 10226 && gains <= 26070) {
                impots = 0.11 * (gains - 10225);
            } else if (gains >= 26071 && gains <= 74545) {
                impots = 0.3 * (gains - 26070) + 0.11 * (26070 - 10225);
            } else if (gains >= 74546 && gains <= 160336) {
                impots = 0.41 * (gains - 74545) + 0.3 * (74545 - 26070) + 0.11 * (26070 - 10225);
            } else if (gains >= 160337) {
                impots = 0.45 * (gains - 160336) + 0.41 * (160336 - 74545) + 0.3 * (74545 - 26070) + 0.11 * (26070 - 10225);
            }
            return impots;
        }
    }


