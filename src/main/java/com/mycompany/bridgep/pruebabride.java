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
public class pruebabride {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AbsConRectangulo rec = new AbsConRectangulo(new ImplementorConcDibujoPunteado(), 0, 0, 0, 0);
        rec.dibujar();
        
        AbsConRectangulo rec2 = new AbsConRectangulo(new ImplementorConcDibujoNormal(), 0, 0, 0, 0);
        rec2.dibujar();
    }
    
}
