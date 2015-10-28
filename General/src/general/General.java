/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * ;
 *
 * @author TWIINS
 */
public class General {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int choix;
        double test1;
        double test2 = 0;
        double test3;
        InputStreamReader lecture = new InputStreamReader(System.in);
        BufferedReader src = new BufferedReader(lecture);
        System.out.println("***** DEBUT DE PROGRAMME *****");
        System.out.println("\t***votre choix pout calcul un perimetre et de la surface d'un forme geometrique***\t ");
        System.out.println("-1- Carre");
        System.out.println("-2- Triangle");
        System.out.println("-3- rectangle");
        System.out.println("-4- Cercle");
        System.out.println("\t*******\t");
        do {
            System.out.println("Tapez votre choix:");
            choix = Integer.parseInt(src.readLine());
        } while ((choix != 1) && (choix != 2) && (choix != 3) && (choix != 4));
        switch (choix) {
            case 1:
                do {
                    System.out.println("donnez le coute de votre Carre :");
                    test1 = Double.parseDouble(src.readLine());
                } while (test1 < 0);
                Carre st = new Carre(test1);
                System.out.println("La Surface = " + st.surface());
                System.out.println("Le Perimetre = " + st.perimetre());
                break;
            case 2:
                System.out.println("Donnez les cotes de votre triangle");
                do {
                    System.out.println("La base: ");
                    test1 = Double.parseDouble(src.readLine());
                    System.out.println("Le cote n°1 : ");
                    test2 = Double.parseDouble(src.readLine());
                    System.out.println("Le cote n°2 : ");
                    test3 = Double.parseDouble(src.readLine());
                } while (test1 < 0 && test2 < 0 && test3 < 0);
                Triangle tri = new Triangle(test1, test2, test3);
                System.out.println("La Surface = " + tri.surface());
                System.out.println("Le Perimetre = " + tri.perimetre());
                break;
            case 3:
                System.out.println("Donnez la longeur & largeur de votre rectangle");
                do {
                    System.out.println("la longeur: ");
                    test1 = Double.parseDouble(src.readLine());
                    System.out.println("La largeur: ");
                    test2 = Double.parseDouble(src.readLine());
                } while (test1 < 0 && test2 < 0);
                Rectangle rect = new Rectangle(test1, test2);
                System.out.println("La Surface = " + rect.surface());
                System.out.println("Le Perimetre = " + rect.perimetre());
                break;
            case 4:
                System.out.println("Donnez le reyon de votre cercle");
                do {
                    System.out.println("Le reyon: ");
                    test1 = Double.parseDouble(src.readLine());
                } while (test1 < 0);
                Cercle cer = new Cercle(test1);

                System.out.println("La Surface = " + cer.surface());
                System.out.println("Le Perimetre = " + cer.perimetre());
                break;
            default:
                System.out.println("Votre choix est intouvable !!");
                break;
        }
        System.out.println("***** FIN DE PROGRAMME *****");
    }

}
