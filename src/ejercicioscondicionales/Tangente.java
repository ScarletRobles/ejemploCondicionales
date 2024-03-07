/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioscondicionales;

import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class Tangente {
    
    public void pedirNumero (){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba un numero ");
        double numero = teclado.nextDouble();
        double tangente = Math.tan(numero);
        System.out.println("La tangente del ángulo es: " + tangente);
    
    }
}
