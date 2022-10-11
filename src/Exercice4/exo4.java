package src.Exercice4;

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
        System.out.println("Entrez le nombre de terme de la suite à calculer n avec n > 0 (0 pour terminer) :");
        
        //Test la fonction Cnp et ensuite faite le calcul Cnp(50,5) *Cnp(11,2) il doit être égale a 116 531 800

        BigInteger result = Cnp(BigInteger.valueOf(50), BigInteger.valueOf(5)).multiply(Cnp(BigInteger.valueOf(11), BigInteger.valueOf(2)));
        System.out.println("Cnp(50,5) *Cnp(11,2) = " + result);
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
