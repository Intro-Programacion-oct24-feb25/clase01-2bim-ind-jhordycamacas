/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author utpl
 */
public class ejercicio001 {

    public static void main(String[] args) {
       int num;
       int operacion;
       String cadenafinal = "";
       String cadenafinal2 = "";
       for (num = 30; num >= 10;num--){
            System.out.printf("%s\n",cadenafinal);
        for (int contador = 1; contador <= 4; contador ++){
           operacion = num * contador;
           cadenafinal = String.format("%s%d-",cadenafinal,operacion);
           
        }
        
     
       }
    }
}