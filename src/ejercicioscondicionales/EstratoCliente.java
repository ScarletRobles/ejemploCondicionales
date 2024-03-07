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
public class EstratoCliente {
    short estrato;
    
    public void pedirEstrato(){
        System.out.println("ingrese el estrato: ");
        Scanner teclado  = new Scanner (System.in);
        estrato = teclado.nextShort();
        
    }
    
    void clasificarEstrato(){
        if (estrato < 3){
            System.out.println("Estrato bajo");
        }else{
            System.out.println("Estrato alto");
        }
    }
    
    public void ejecutar(){
        pedirEstrato();
        clasificarEstrato();
        
        
                
    }
    
}
