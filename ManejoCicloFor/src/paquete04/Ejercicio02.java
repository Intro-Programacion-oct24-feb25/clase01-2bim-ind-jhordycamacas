/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author utpl
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        double celcius;
        double farenheit;
        int operacion;
        String cadenafinal = "";
        String cadenafinal2 = "";

        for (operacion = 0; operacion <= 20; operacion++) {
            for (farenheit = 20; farenheit <= 100; farenheit += 4) {
                celcius  = 5 / 9 * (farenheit - 32);
                cadenafinal = String.format("%sOperacion (%d) Farenheit: %.2f ===> Celcius: %.2f\n",
                        cadenafinal,
                        operacion,
                        farenheit,
                        celcius);

            }

            cadenafinal2 = String.format("%s%s", cadenafinal2, cadenafinal);
            cadenafinal = "";
        }

        System.out.printf("%s", cadenafinal2);
    }
}
