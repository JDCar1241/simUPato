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
    public static void main(String[] args) {
        patoReal patoReal = new patoReal();
        patoCabezaRoja patoCabezaRoja = new patoCabezaRoja();
        patoSeñuelo patoSeñuelo = new patoSeñuelo();
        patogoma patogoma = new patogoma();

        patoReal.mostrar();
        patoReal.volar();
        patoReal.cuaquear();

        System.out.println("");

        patoCabezaRoja.mostrar();
        patoCabezaRoja.volar();
        patoCabezaRoja.cuaquear();

        System.out.println("");

        patoSeñuelo.mostrar();
        patoSeñuelo.volar();
        patoSeñuelo.cuaquear();

        System.out.println("");

        patogoma.mostrar();
        patogoma.volar();
        patogoma.cuaquear();
        // holi
    }}

