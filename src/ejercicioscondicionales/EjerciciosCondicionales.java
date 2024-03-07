/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioscondicionales;

/**
 *
 * @author SENA
 */
public class EjerciciosCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AtributosyMetodos miobj = new AtributosyMetodos();
        miobj.mostrarVariables();
        miobj.dividirDosNumeros();
        miobj.multiplicarDosNumeros(2, 2);
        miobj.restarDosNumeros(9,8);
        miobj.restarDosNumeros(3, 5);
        miobj.mostrarSumayResta();
        
        EstratoEmpleado miest = new EstratoEmpleado();
        miest.pedirEstrato();
        miest.pedirCiudad();
        
        EstratoCliente miestc = new EstratoCliente();
        miestc.ejecutar();
        
        EstratoEstudiante miestudiante = new EstratoEstudiante();
        miestudiante.mostrarEstudianteTres();
        
        TareaHoroscopo miH = new TareaHoroscopo();
        miH.pedirDatos();
        miH.procesarDatos();
        miH.mostrarMensaje();
        
        ActividadCiclos miAc = new ActividadCiclos();
        miAc.cicloMientras();
        miAc.comienzaPorSt();
        
        TodoMinuscula miMinuscula = new TodoMinuscula();
        miMinuscula.mostrarMinuscula();
        
        //el método permite obtener la tangente de un valor es Math.tan();
        //el método permite ordenar un array es sort()
    }
 
   
   
    
   
        
  
    

  
}
