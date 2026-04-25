/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsem02pt;

/**
 *
 * @author sistemas
 */
public class PatoCabezaRoja extends pato implements volable,cuaqueable {
    @Override 
    public void mostrar(){
        System.out.println("soy un pato real");
    }
    @Override
    public void volar(){
        System.out.println("puedo volar con mis alas");
    }
    @Override
    public void cuaquear() {
            System.out.println("soy un verdadero pato por eso hago cuack cuack");
    
}
       @Override 
    public void nadar() {
        System.out.println("todos los patos nadan");
    }
    
}
