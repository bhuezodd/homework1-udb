# Boris Ilich Huezo Arriola - HA212912

# Foro 1

# Investigacion

## 1. Collection
Definición:
La interfaz Collection es la raíz de la jerarquía de colecciones en Java. Define operaciones generales que se aplican a todos los tipos de colecciones, como agregar, eliminar, y verificar elementos. Sin embargo, Collection no se implementa directamente; en su lugar, otras interfaces como List, Set y Queue heredan de ella.

### Ejemplo

```
// Imports necesarios para su uso
import java.util.Collection;
import java.util.ArrayList;

public class CollectionExample {
    public static void main(String[] args) {
        // Declaración de una Collection
        Collection<String> frutas = new ArrayList<>();

        // Asignación de valores
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");

        System.out.println("Frutas: " + frutas);

        // Eliminación de un valor
        frutas.remove("Banana");
        System.out.println("Frutas después de eliminar Banana: " + frutas);
    }
}
```

## 2. List
Definición:
Una List es una colección ordenada que permite elementos duplicados. Se basa en un índice, lo que permite acceder a los elementos de manera secuencial o directa.

### Ejemplo

```
// Imports necesarios para su uso
import java.util.List;
import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        // Declaración de una List
        List<String> nombres = new ArrayList<>();

        // Asignación de valores
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Luis");

        System.out.println("Nombres: " + nombres);

        // Eliminación de un valor por índice
        nombres.remove(1);
        System.out.println("Nombres después de eliminar Ana: " + nombres);
    }
}
```

## 3. Map
Definición:
Un Map es una colección que almacena pares clave-valor, donde cada clave es única y se usa para acceder a su valor asociado.

### Ejemplo

```
// Imports necesarios para su uso
import java.util.Map;
import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        // Declaración de un Map
        Map<Integer, String> estudiantes = new HashMap<>();

        // Asignación de valores
        estudiantes.put(1, "Juan");
        estudiantes.put(2, "María");
        estudiantes.put(3, "Pedro");

        System.out.println("Estudiantes: " + estudiantes);

        // Eliminación de un valor por clave
        estudiantes.remove(2);
        System.out.println("Estudiantes después de eliminar la clave 2: " + estudiantes);
    }
}

```

# Ejercicio 1

Se requiere elaborar un programa que permita almacenar los estudiantes de UDB VIRTUAL de la 
materia de Programación Orientada a objetos