package src.Exercice4;

import src.Menu;
import src.Utils.utils;

import java.math.BigInteger;

/**
 * @author : Obry Maxime
 *  Class de l'exercice 4
 */
public class exo4 {
    /**
     * Fonction principale de l'exercice 4
     *
     * @param args Parametre de la ligne de commande(non utilisé)
     */
    public static void main(String[] args) {
        System.out.println("-----Exercice 4 -----");
        System.out.println("1 - Choississez la fonction principale de l'exercice avec des inputs");
        System.out.println("2 - Choississez seulement de factorisé");
        System.out.println("3 - Choississez la fonction principale avec multiplication");
        System.out.println("4 - Testé seulement la fonction Cnp");
        System.out.println("5 - Pour Quitter");

        int value = utils.entierInt();
        while (true) {
            switch (value) {
                case 1:
                    System.out.println("Vous avez choisi la methode 1");
                    System.out.println("Entrer la valeur de n");
                    int n = utils.entierInt();
                    System.out.println("Entrer la valeur de p");
                    int p = utils.entierInt();
                    System.out.println("la valeur de la methode 1 est " + Cnp(BigInteger.valueOf(n), BigInteger.valueOf(p)));
                    main(args);
                case 2:
                    System.out.println("Vous avez choisi de factorisé un nombre");
                    System.out.println("Choississez un nombre");
                    int i = utils.entierInt();
                    System.out.println(factorize(BigInteger.valueOf(i)));
                    main(args);
                case 3:
                    System.out.println("Entrer la premiere valeur de n");
                    int n2 = utils.entierInt();
                    System.out.println("Entrer la premiere valeur de p");
                    int p2 = utils.entierInt();
                    System.out.println("Entrer la deuxieme valeur de n");
                    int n3 = utils.entierInt();
                    System.out.println("Entrer la deuxieme valeur de p");
                    int p3 = utils.entierInt();
                    BigInteger result1 = Cnp(BigInteger.valueOf(n2), BigInteger.valueOf(p2)).multiply(Cnp(BigInteger.valueOf(n3), BigInteger.valueOf(p3)));
                    System.out.println("Cnp(" + n2 + ", " +p2 + ") x Cnp(" + n3 + ", " +p3 + ") = " + result1);
                    main(args);
                case 4 :
                    BigInteger result = Cnp(BigInteger.valueOf(50), BigInteger.valueOf(5)).multiply(Cnp(BigInteger.valueOf(11), BigInteger.valueOf(2)));
                    System.out.println("Cnp(50,5) x Cnp(11,2) = " + result);
                    main(args);
                case 5 :
                    Menu.main(args);
                //Test la fonction Cnp et ensuite faite le calcul Cnp(50,5) *Cnp(11,2) il doit être égale a 116 531 800
            }
            System.out.println("Veuillez entrer un nombre entre 1 et 5");
            main(args);
        }
    }


    public static BigInteger Cnp(BigInteger n, BigInteger p){
        return factorize(n).divide(factorize(n.subtract(p)).multiply(factorize(p)));
    }

    /**
     * Il prend un nombre et renvoie la factorielle de ce nombre
     *
     * @param i Le nombre à factoriser
     * @return La factorielle du nombre transmis.
     */
    private static BigInteger factorize(BigInteger i) {
        BigInteger result = BigInteger.valueOf(1);
        for (int j = 1; j <= i.intValue(); j++) {
            result =  result.multiply(BigInteger.valueOf(j));
        }
        return result;
    }


}
