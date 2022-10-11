package src.Exercice1;


import static src.Utils.utils.isDouble;


/**
 * @author : Jeham Laurie
 * Class de l'exercice 1
 * Ecrire un programme qui prend en compte un double X et Y, puis qui calcule la valeur de Cn et In
 * Ce programme reprend les méthodes de la classe Archimede
 */

public class exo1 {
    /**
     * Fonction principale de l'exercice 1
     * @param args Parametre de la ligne de commande(non utilisé)
     */
    public static void main(String[] args) {
        System.out.println("-----Exercice 1 -----");
        System.out.println("Entrer un double positif");
        double x = isDouble(); // Regarde si l'input est bien un double positif
        System.out.println("Entrer un second double positif");
        double y = isDouble();
        Archimede.Cn(x, y);
        System.out.println("Vous vous appretez à rentrer deux doubles positifs");
        x = isDouble(); // Regarde si l'input est bien un double positif
        System.out.println("Entrez le deuxieme double");
        y = isDouble();
        Archimede.In(x, y);
    }
}
