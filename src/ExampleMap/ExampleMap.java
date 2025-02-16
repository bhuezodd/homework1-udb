/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExampleMap;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author huezo
 */
public class ExampleMap {    
    public static void main(String[] args) {
        // Declaración de un Map
        Map<String, String> estudiantes = new HashMap<>();

        // Asignación de valores
        estudiantes.put("id1", "Juan");
        estudiantes.put("id2", "María");
        estudiantes.put("id3", "Pedro");

        System.out.println("Estudiantes: " + estudiantes);

        // Eliminación de un valor por clave
        estudiantes.remove("id2");
        System.out.println("Estudiantes después de eliminar la clave 2: " + estudiantes);
    }
}
