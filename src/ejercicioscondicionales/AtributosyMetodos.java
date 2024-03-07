/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioscondicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class AtributosyMetodos {
    
    String nombre = "Ronald Deschain";
    short edad= 16;
    int poblacion =1_200_000;
    long enteroLargo = 200_045_320_202l;
    char vocal = 'a';
    float altura = 1_500.253f;
    double distancia = 194_000_200_230_230.0000494;
    boolean esNoche = false; 
    
    public void mostrarVariables(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad );
        System.out.println("Poblacion: "+ poblacion);
        System.out.println("Entero Largo : "+ enteroLargo);
        System.out.println("Vocal: "+ vocal);
        System.out.println("Altura: "+ altura);
        System.out.println("Distancia"+ distancia);
        System.out.println("Es de noche"+ esNoche);
           
    
        
    }
    
    public void dividirDosNumeros(){
        float numero = 220;
        float valor = 12;
        float resultado = numero / valor;
        System.out.println("El resultado es: "+resultado);
        JOptionPane.showMessageDialog(null, resultado);
    
    }      
            
     
    public void multiplicarDosNumeros(int  cantidad, int precio){
        int total = precio * cantidad;
        System.out.println("El total de la multiplicacion es = "+ total);
    }
    
    public int restarDosNumeros(int cotizacion, int presupuesto){
        int respuesta = cotizacion - presupuesto;
        return respuesta;
    }
    
    public double sumarDosNumeros(double poblacion, double dato){
        double salida = poblacion + dato;
        return salida;
    }
    
   public void mostrarSumayResta(){
       int resta = restarDosNumeros(50, 23);
       double suma = sumarDosNumeros(89.29, 233.002);
       System.out.println("La resta da= "+ resta);
       System.out.println("La suma es= "+ suma);
   }

   
}
