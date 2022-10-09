package src.Exercice1;

import static src.Utils.utils.isDouble;

public class exo1 {
    public static void main(String[] args) {
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
