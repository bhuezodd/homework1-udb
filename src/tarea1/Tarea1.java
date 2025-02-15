/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author boris ilich huezo arriola
 * @carnet HA212912
 */
public class Tarea1 {

    
    public static final String RESET = "\u001B[0m";   // Restablece el color por defecto
    public static final String ERROR = "\u001B[31m";
    public static final String SUCCESS = "\u001B[32m";
    public static final String WARNING = "\u001B[33m";
    
    private static Map<String, String> students = new HashMap<>();
    
    
    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int option;
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.println("---- Opciones ----");
            System.out.println("1- Ingresar alumno");
            System.out.println("2- Buscar alumno por carnet");
            System.out.println("3- Elimar alumno por carnet");
            System.out.println("4- Mostrar todos los alumnos");
            System.out.println("5- Exit");
            
            System.out.print("Ingresa una opción: ");
            option = scanner.nextInt();
            
            clearScreen();
            switch (option) {
                case 1:
                    firstOption();
                    break;
                case 2:
                    secondOption();
                    break;
                    
                    
                case 4:
                    listStudents();
                    break;
                    
                case 5:
                    System.out.println(WARNING + "Adios, vuelve pronto!!" + RESET);
                    break;
                default:
                    System.out.println(ERROR + "Opción no encontrada" + RESET);
            }
            
            
        } while(option != 5);
    }
    
    private static void firstOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---- Ingresar alumno ----");
        
        String carnet;
        boolean isOk = false;
        do {
            System.out.print("Numero de carnet: ");
            carnet = scanner.nextLine();
            
            if (students.containsKey(carnet)) {
                System.out.println(ERROR + "Carnet ya ha sido registrado" + RESET);
            } else {
               isOk = true; 
            }
        
        } while (!isOk);
        
        
        
        System.out.println();
        System.out.print("Nombre completo: ");
        String name = scanner.nextLine();
        
        students.put(carnet, name);
        System.out.println(SUCCESS + "Alumno ingresado exitosamente" + RESET);
    }
    
    private static void secondOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---- Buscar alumno ----");
        
       System.out.print("Ingrese carnet: ");
       String carnet = scanner.nextLine();
       
       if (students.containsKey(carnet)) {
            String name = students.get(carnet);
           
            System.out.println("Carnet: " + carnet);
            System.out.println("Nombre completo: " + name);
       } else {
                System.out.println(ERROR + "“Alumno no encontrado, no se \n" +
"puede Mostrar" + RESET);
       }
    
        
    }
    
    private static void listStudents() {
        
        System.out.println("+----------------+----------------------+");
        System.out.printf("| %-14s | %-20s |\n", "Carnet", "Nombre completo");
        System.out.println("+----------------+----------------------+");
        students.entrySet().forEach((entry) -> { 
            System.out.printf("| %-14s | %-20s |\n", entry.getKey(), entry.getValue());
            System.out.println("+----------------+----------------------+");
        });
    }
}
