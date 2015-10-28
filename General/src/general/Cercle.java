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
public class Cercle extends General {

    private double reyon;

    public Cercle(double reyon) {
        this.reyon = reyon;
    }

    Cercle(double test1, double test2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getReyon() {
        return reyon;
    }

    public void setReyon(double reyon) {
        this.reyon = reyon;
    }

    public double surface() {
        return reyon * reyon * 3.14;
    }

    public double perimetre() {
        return reyon * 3.14 * 2;
    }
}
