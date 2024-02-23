package ejercicios;

import java.util.Scanner;

public class MainArrays {
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numOrdenados = new int[10];
        int[] numIngresados = new int[10];
        int posicionPrimos = 0; 
        int posicionNoPrimos = numOrdenados.length - 1;
        
        System.out.println("Bienvenido, yo arreglare tus numeros para posicionar los prmos primero\nDeberas ingresar tus numeros.");

        for (int i = 0; i < numIngresados.length; i++) {
        	
            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            int numUsuario = Integer.valueOf(scan.nextLine());
            
            numIngresados[i] = numUsuario;
            
            boolean primo = esPrimo(numUsuario);
            
            if (primo) {
                numOrdenados[posicionPrimos] = numUsuario;
                posicionPrimos++;
            } else {
                numOrdenados[posicionNoPrimos] = numUsuario;
                posicionNoPrimos--;
            }
        }
        
        System.out.println("\nposicion | valor");
        imprimirArray(numIngresados);
        System.out.println();
        imprimirArray(numOrdenados);

        scan.close();
    }

    public static boolean esPrimo(int numIngresado) {
        if (numIngresado <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(numIngresado); i++) {
            if (numIngresado % i == 0) {
                return false;
            }
        }
        
        return true;
    }

    public static void imprimirArray(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println( i + " = " + arreglo[i]);
        }
    }
}

