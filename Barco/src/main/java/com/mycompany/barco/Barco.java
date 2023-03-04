/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.barco;

/**
 *
 * @author pedro.psilva8
 */
public class Barco {
   //atributos
   private static String marca = "E169";
   private String nome;
   private int velocidade;
   private String Cor;
   
   //construtor possibilita alterar caracteristicas de atributos de uma classe que esta privada   
   public Barco (){
       
       this.Cor = "branca";
   }
   
   //construtor possibilita alterar caracteristicas de atributos de uma classe recebendo ela como parametro
   public Barco (String novaCor){
      this.Cor = novaCor; 
   }
   
   
   //metodo acessorio que permite a cor sofrer alterações
   public void setCor (String novaCor){
       
       this.Cor = novaCor;
       
   }       
   
   public String getCor(){
       return this.Cor.toUpperCase();
   }
   
   
   public int getVelocidade(){
       return this.velocidade;
   }
   public void setVelocidade(int novaVelocidade){
       this.velocidade = novaVelocidade;
   }
   
   public void acelerar(){
       this.velocidade +=10;
   }
   
   public void acelerar (int novaVelocidade){
       this.velocidade = novaVelocidade;
   }
   
}//fim
