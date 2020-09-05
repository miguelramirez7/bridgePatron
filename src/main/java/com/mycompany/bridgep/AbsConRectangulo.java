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
public class AbsConRectangulo implements AbstraccionForma{

    private ImplementorDibujo dibujo;
    private double x1,y1,x2,y2;
    public AbsConRectangulo(ImplementorDibujo dibujo,double x1,double y1,double x2,double y2) {
        this.dibujo=dibujo;
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }
        
    @Override
    public void dibujar() {
        dibujo.dibujarRectangulo(x1, y1, x2, y2);
    }
    
}
