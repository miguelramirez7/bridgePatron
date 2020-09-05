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
public class AbsConcCirculo implements AbstraccionForma{
    private ImplementorDibujo dibujo;
    private double x,y,r;
    public AbsConcCirculo(ImplementorDibujo dibujo,double x,double y,double r) {
        this.dibujo=dibujo;
        this.x=x;
        this.y=y;
        this.r=r;
    }
        
    @Override
    public void dibujar() {
        dibujo.dibujarCirculo(x, y, r);
    }
    
}
