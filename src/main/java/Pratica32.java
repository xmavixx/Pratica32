/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Victor
 */
public class Pratica32 {

    public static double densidade(double x, double media, double desvio) {

        double d;
        double raiz;
        double elevado;

        raiz = 2 * Math.PI;
        elevado = (-1 / 2) * Math.pow(((x - media) / desvio), 2);

        d = (1 / ((((Math.sqrt(raiz)))*desvio))) * Math.pow(Math.E, elevado);

        return d;
    }
}
