/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 *
 * @author Estudiante
 */
public class Archivos1 {

    public static void main(String[] args) throws FileNotFoundException {
      /*  File f = new File("hamlet.txt");
        System.out.println("¿El archivo existe? "+f.exists());
        System.out.println("¿El archivo se puede leer? "+ f.canRead());
        System.out.println("El tamaño en bytes es " +f.length());
        System.out.println("La ruta del archivo es " +f.getAbsolutePath());
        */
         
        PrintStream output = new PrintStream(new File ("hello.txt"));
        output.println("Hello world");
        output.println();
        output.println("Este programa produce cuatro ");
        output.println("lineas de salida");
    
      
}
    
}
