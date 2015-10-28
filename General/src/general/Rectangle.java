/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

/**
 *
 * @author TWIINS
 */
public class Rectangle extends General {

    double longeur;
    double largeur;

    public Rectangle(double longeur, double largeur) {
        this.longeur = longeur;
        this.largeur = largeur;
    }

    public double getLongeur() {
        return longeur;
    }

    public void setLongeur(double longeur) {
        this.longeur = longeur;
    }

    public double getLargeur() {
        return longeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double surface() {
        return longeur * largeur;
    }

    public double perimetre() {
        return (longeur * largeur) * 2;
    }
}
