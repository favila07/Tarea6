/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6;

import java.util.HashMap;
import java.util.Map;
        

/**
 *
 * @author Real Madrid
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Map<String, Integer> estudiantes = new HashMap<>();
        estudiantes.put("Jesus", 90); 
        estudiantes.put("Martin", 60);
        estudiantes.put("Cecilia", 60);
        estudiantes.put("Mateo", 80);
        estudiantes.put("Marcos", 85);
        
        for (Map.Entry<String, Integer> entry: estudiantes.entrySet()) {
            
            String nombre = entry.getKey();
            int nota = entry.getValue();
            String resultado = (nota >=70)? "Aprobado" : "Reprobado" ;
            System.out.println(nombre + " = " + nota + " " + resultado);
            
        }
        
    
    
    }
}
