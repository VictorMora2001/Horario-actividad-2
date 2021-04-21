/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario.actividad.pkg2;
import java.util.Scanner;
/**
 *
 * @author amigo
 */
public class HorarioActividad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hora;
        String text = null;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor introduzca una hora (en el formato de 24 horas) para poder mostrarle su intinerario:");
        hora = sc.nextInt ();
        
        if (hora <= 24){
            switch (hora) {
                case 0:
                    System.out.println("Dormir");
                    break;
                case 1:
                    System.out.println("Dormir");
                    break;
                case 2:
                    System.out.println("Dormir");
                    break;
                case 3:
                    System.out.println("Dormir");
                    break;
                case 4:
                    System.out.println("Dormir");
                    break;    
                case 5:
                    System.out.println("Dormir");
                    break;
                case 6:
                    System.out.println("Dormir");
                    break;
                case 7:
                    System.out.println("Desayunar");
                    break;    
                case 8:
                    System.out.println("Tomar clase");
                    break;    
                case 9:
                    System.out.println("Tomar clase");
                    break;    
                case 10:
                    System.out.println("Tomar clase");
                    break;    
                case 11:
                    System.out.println("Tomar clase");
                    break;    
                case 12:
                    System.out.println("Tomar clase");
                    break;    
                case 13:
                    System.out.println("Tomar clase");
                    break;    
                case 14:
                    System.out.println("Almorzar");
                    break;    
                case 15:
                    System.out.println("Jugar");
                    break;
                case 16:
                    System.out.println("Jugar");
                    break;
                case 17:
                    System.out.println("Bañarse");
                    break;  
                case 18:
                    System.out.println("Hacer tarea");
                    break;    
                case 19:
                    System.out.println("Hacer tarea");
                    break;    
                case 20:
                    System.out.println("Jugar");
                    break;    
                case 21:
                    System.out.println("Jugar");
                    break;    
                case 22:
                    System.out.println("Cenar");
                    break;    
                case 23:
                    System.out.println("Jugar");
                    break;    
                case 24:
                    System.out.println("Dormir");
                    break;    
            }
        }
        
    }
    
}
