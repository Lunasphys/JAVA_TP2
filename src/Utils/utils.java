package src.Utils;

import java.util.Scanner;


/**
 * @author : Jeham Laurie And Obry Maxime
 * Class pour les méthodes utilitaires utilisées dans les exercices
 */
public class utils {
    /**
     * @author : Jeham Laurie
     * Methode qui demande un entier à l'utilisateur et renvoie une erreur si ce n'est pas un entier ou si c'est un entier négatif
     */
    public static int entierInt() { // Permet de savoir si l'input de l'utilisateur est bien un entier
        Scanner scan = new Scanner(System.in); // Scan l'input
        while (!scan.hasNextInt()) { // Tant que l'input n'est pas un int, renvoit un message d'erreur et scan le prochain input
            System.out.println("Rentrez un entier");
            scan.next();
        }
        int nb = scan.nextInt();
        if (nb < 0) { // Tant que l'input n'est pas un int positif, renvoit un message d'erreur et scan le prochain input
            System.out.println("Veuillez entrez un entier positif");
            return entierInt();
        }
        return nb;
    }

    /**
     * @author Laurie Jeham
     * Méthode qui permet de retourner un bouléen en fonction de la réponse de l'utilisateur.
     * Elle vérifie que l'entrée ne soit pas un string vide, "null" ou inférieur à 0.
     */
    public static boolean isFloat(String string) { // Bouléen qui permet de verifier si la valeur est bien un nombre decimal
        float floatValue;
        System.out.printf("Verification: \"%s\"%n", string);
        if (string == null || string.equals("") || Float.parseFloat(string) < 0) { // Si la valeur est null ou contient une string vide
            System.out.println("Ne peut être lu");
            return false;
        }

        try { // Si la chaine de caractère est bien un float renvoit : vrai
            floatValue = Float.parseFloat(string);
            return true;
        } catch (NumberFormatException e) { // // Sinon demande de réessayer avec une autre valeur
            System.out.println("Le nombre saisi n'est pas un nombre decimal, veuillez reessayer");
        }
        return false;
    }

    /**
     * @author : Obry Maxime
     * Methode qui demande un float à l'utilisateur et renvoie une erreur si ce n'est pas un float ou si c'est un float négatif
     */
    public static float isFloat2() { // Permet de savoir si l'input de l'utilisateur est bien un entier
        Scanner scan = new Scanner(System.in); // Scan l'input
        while (!scan.hasNextInt()) { // Tant que l'input n'est pas un int, renvoit un message d'erreur et scan le prochain input
            System.out.println("Rentrez un entier");
            scan.next();
        }
        float nb = scan.nextInt();
        if (nb < 0) { // Tant que l'input n'est pas un int positif, renvoit un message d'erreur et scan le prochain input
            System.out.println("Veuillez entrez un entier positif");
            return entierInt();
        }
        return nb;
    }

    /**
     * @author Jeham Laurie
     * Methode qui demande un string à l'utilisateur et renvoie une erreur si ce n'est pas un string et si la chaine de caractère est vide
     */
    public static String isString() { // Fonction qui permet de savoir si l'entrée est bien une chaîne de caractère
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextLine()) { // Si l'input n'est pas une chaine de caractere (scan la prochaine ligne)
            System.out.println("Rentrez une chaine de caractere");
            scan.next();
        }
        String str = scan.nextLine();
        if (str.length() > 0) {
            return str;
        } else if (str.length() == 0) {
            System.out.println("Votre chaine de caractere est vide ");
            return str;
        }
        return str;
    }


    /**
     * @author Jeham Laurie
     * Methode qui verifie si l'input de l'utilisateur qui est un entier est bien binaire et renvoie une erreur si ce n'est pas le cas
     */
    public static String isBinary() {  // Fonction qui permet de savoir si la chaine de caractère est bien un nombre binaire
        String num;
        Scanner scan = new Scanner(System.in);
        num = scan.next(); // Permet de rentrer un input
        while (!num.startsWith("1")) { // Si l'input ne commence pas par un 1
            System.out.println("Rentrez un nombre binaire commencant par 1, composé de 0 et de 1");
            return num;
        }
        if (num.matches("[01]+") && num.startsWith("1")) {     // Regarde si l'input contient bien 0 et 1 et s'il ne commence pas avec un 0
            System.out.println("Votre input est bien un nombre binaire");
            String str3 = String.valueOf(Integer.parseInt(num, 2));
            System.out.println("Le nombre decimal du nombre binaire " + num + " est " + str3);
        } else {
            System.out.println("Rentrez un nombre binaire commencant par 1, composé de 0 et de 1");
            return num;
        }
        return num;
    }

    /**
     * @author : Jeham Laurie
     * Methode qui demande un double à l'utilisateur de donner un double. Il renvoie une erreur si ce n'est pas un double ou si c'est un double négatif et renvoit le double si c'est un double positif
     */
    public static double isDouble() { // permet de verifier si l'input  est bien un double
        boolean is_Double = false;
        double nb = 0;
        while (is_Double != true) {
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            try {
                nb = Double.parseDouble(str);
                is_Double = true;
                if (nb <= 0) {
                    System.out.println("Veuillez entrez un double positif");
                    return isDouble();
                } else {
                    is_Double = true;
                    str = "";
                }
            } catch (NumberFormatException e) {
                System.out.println("Rentrez un double");
            }
        }
        return nb;
    }
}



