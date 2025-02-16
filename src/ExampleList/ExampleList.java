/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExampleList;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author huezo
 */
public class ExampleList {
    public static void main(String[] args) {
        // Declaración de una List
        List<String> nombres = new ArrayList<>();

        // Asignación de valores
        nombres.add("Carlos"); // 0
        nombres.add("Ana"); // 1
        nombres.add("Luis"); // 2
        nombres.add("Ana"); // 3

        System.out.println("Nombres: " + nombres);

        // Eliminación de un valor por índice
        nombres.remove(3);
        System.out.println("Nombres después de eliminar Ana: " + nombres);
    }
}
