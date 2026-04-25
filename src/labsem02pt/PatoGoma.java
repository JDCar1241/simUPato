/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsem02pt;

/**
 *
 * @author sistemas
 */
public class PatoGoma extends pato implements volable,cuaqueable {
     @Override 
    public void mostrar(){
        System.out.println("soy un pato de goma");
    }
    @Override
    public void volar(){
        System.out.println("no puedo volar con mis alas");
    }
    @Override
    public void cuaquear() {
            System.out.println("soy un pato falso  por eso hago chirr chirr");
  
}
      @Override 
    public void nadar() {
        System.out.println("todos los patos nadan");
    }
    
    
}
