/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class HorasdeTrabajo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int dias,hr,suma1=0,suma2=0,suma3=0,min,seg;
        System.out.println("¿Cuantos dias trabajo? ");
        dias=entrada.nextInt();
        for (int i=0; i<dias;i++){
            System.out.println("¿Cuantas horas trabajo este dia? ");
            hr=entrada.nextInt();
            suma1=suma1+hr;
            System.out.println("¿Cuantos minutos trabajo este dia? ");
            min=entrada.nextInt();
            suma2=suma2+min;
            System.out.println("Cuantos segundos trabajo este dia? ");
            seg=entrada.nextInt();
            suma3=suma3+seg;
        }
        if(suma3>60){
            suma3=suma3-60;
            System.out.println("El total de segundos trabajados es: "+ suma3); 
            suma2=suma2+1;
        }else{
            System.out.println("El total de segundos trabajados es: "+ suma3);
        }
        if(suma2>60){
            suma2=suma2-60;
            System.out.println("El total de minutos trabajados es: " + suma2);
            suma1=suma1+1;
        }else{
            System.out.println("El total de minutos trabajados es: " + suma2);
        }
        System.out.println("El total de horas trabajadas es: " + suma1);
    }
    
}
