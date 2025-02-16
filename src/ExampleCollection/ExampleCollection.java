/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExampleCollection;
import java.util.Collection;
import java.util.ArrayList;

/**
 *
 * @author huezo
 */
public class ExampleCollection {
    public static void main(String[] args) {
        // Declaración de una Collection
        Collection<String> frutas = new ArrayList<>();

        // Asignación de valores
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        frutas.add("Banana");

        System.out.println("Frutas: " + frutas);

        // Eliminación de un valor
        frutas.remove("Banana");
        System.out.println("Frutas después de eliminar Banana: " + frutas);
    }
}
