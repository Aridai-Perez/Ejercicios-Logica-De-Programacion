package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMinutosRestantes {
    public static void main(String[] args) {
    	
    	System.out.println("Bienvenido, quieres saber cuantos minutos faltan para el grandioso fin de semana?\nIngresa los datos.");
        int hora;
        int minutos;
        int minutosParaFinde;
        Scanner sc = new Scanner(System.in);
    	
       do{
        	System.out.print("Día de la semana: ");
        	String dia = sc.nextLine().toLowerCase();
        	System.out.print("Hora: ");
        	hora = Integer.valueOf(sc.nextLine());
        	System.out.print("Minutos: ");
        	minutos = Integer.valueOf(sc.nextLine());
	
        	minutosParaFinde = calcularMinutos(dia, hora, minutos);
	
        	if (hora > 24 || minutos > 59 || minutosParaFinde == -1) {
        		System.out.println("Datos no válidos. Vuelve a intentarlo.");
        	} else if (minutosParaFinde != -1){
        		System.out.println("Datos introducidos:\n" + dia + " " + hora + ":" + minutos);
        		System.out.println("Por lo tanto, faltan " + minutosParaFinde + " minutos para el fin de semana");
        	}
	
        } while(hora > 24 || minutos > 59|| minutosParaFinde == -1);
       sc.close();
    }

    public static int calcularMinutos(String dia, int hora, int minutos) {
        int minutosRestantes = 0;
        int diasAMinutos = 0;
        ArrayList<String> semana = new ArrayList<>();
        semana.add("viernes");
        semana.add("jueves");
        semana.add("miercoles");
        semana.add("martes");
        semana.add("lunes");

        if (semana.contains(dia)) {
            int index = semana.indexOf(dia);
            diasAMinutos = index * 24 * 60;
        } else {
            return -1;
        }

        minutosRestantes = diasAMinutos + ((15 - hora) * 60 - minutos);

        return minutosRestantes;
    }
}
