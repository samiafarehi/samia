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
public class Triangle extends General {

    double base;
    double cote1;
    double cote2;

    public Triangle(double base, double cote1, double cote2) {
        this.base = base;
        this.cote1 = cote1;
        this.cote2 = cote2;
    }

    public double getBase() {
        return base;
    }

    public double getCote1() {
        return cote1;
    }

    public double getCote2() {
        return cote2;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setCote1(double cote1) {
        this.cote1 = cote1;
    }

    public void setCote2(double cote2) {
        this.cote2 = cote2;
    }

    public double surface() {
        return (base + cote1 + cote2) / 2;
    }

    public double perimetre() {
        return base + cote1 + cote2;
    }
}
