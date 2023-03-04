/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.barco;

/**
 *
 * @author pedro.psilva8
 */
public class Fabrica {
    
    public static void main(String[] args) {
        
        Barco meuBarco = new Barco();      
        System.out.println("Cor do barco " + meuBarco.getCor());
        
        //criando o objeto barco 2 e passando como parametro no metodo construtor a nova cor
        Barco meuBarco2 = new Barco("azul");
        System.out.println("Cor do barco 2 "+ meuBarco2.getCor());
        
        meuBarco.acelerar();
        meuBarco.acelerar();
        meuBarco.acelerar();
        System.out.println("velocidade do barco "+meuBarco.getVelocidade());
        
        meuBarco2.acelerar(50);
        System.out.println("velocidade do barco "+meuBarco2.getVelocidade());
        
        
    }
    
}
