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
public class Carre extends General {

    double coute;

    public Carre(double coute) {
        this.coute = coute;
    }

    public double getCoute() {
        return coute;
    }

    public void setCoute(double coute) {
        this.coute = coute;
    }

    public double surface() {
        return coute * coute;
    }

    public double perimetre() {
        return coute * 4;
    }
}
