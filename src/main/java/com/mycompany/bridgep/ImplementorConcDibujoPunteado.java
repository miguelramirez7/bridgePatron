/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bridgep;

/**
 *
 * @author User
 */
public class ImplementorConcDibujoPunteado implements ImplementorDibujo{

    @Override
    public void dibujarRectangulo(double x1, double y1, double x2, double y2) {
        System.out.println("dibujando rectangulo punteado");
    }

    @Override
    public void dibujarCirculo(double x, double y, double r) {
        System.out.println("dibujando circulo punteado");
    }
    
}
