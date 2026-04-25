/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsem02pt;
import java.io.*;
/**
 *
 * @author sistemas
 */
public class Main {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 System.out.println("---------------------------------------------");
        PatoReal PatoReal = new PatoReal();
         System.out.println("Pato Real: ");
         
         PatoReal.mostrar();
         PatoReal.volar();
         PatoReal.cuaquear();
         PatoReal.nadar();
         
         System.out.println("---------------------------------------------"); 
         System.out.println("Pato cabeza roja");
         
         PatoCabezaRoja pcr = new PatoCabezaRoja();
       
         
         pcr.mostrar();
         pcr.volar();
         pcr.cuaquear();
         pcr.nadar();  
         
         System.out.println("---------------------------------------------");
         System.out.println("Pato de Goma");
         
         PatoGoma pg = new PatoGoma();
         
         pg.mostrar();
         pg.volar();
         pg.cuaquear();
         pg.nadar();
         
          System.out.println("---------------------------------------------");
          System.out.println("PatoSeñuelo");
          
          PatoSeñuelo ps =new PatoSeñuelo();
          
          ps.mostrar();
          ps.volar();
          ps.cuaquear();
          ps.nadar();
         
        
        
}}

