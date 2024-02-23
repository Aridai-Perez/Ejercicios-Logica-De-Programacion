package ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class MainColecciones {
    public static void main(String[] args) {

        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("Gato", "Cat");
        diccionario.put("Perro", "Dog");
        diccionario.put("Papel", "Paper");
        diccionario.put("Sol", "Sun");
        diccionario.put("Luna", "Moon");
        diccionario.put("Libro", "Book");
        diccionario.put("Botella", "Bottle");
        diccionario.put("Silla", "Chair");
        diccionario.put("Agua", "Water");
        diccionario.put("Trabajo", "Job");
        diccionario.put("Mesa", "Table");
        diccionario.put("Celular", "Cellphone");
        diccionario.put("Mueble", "Furniture");
        diccionario.put("Archivo", "File");
        diccionario.put("Programar", "Program");
        diccionario.put("Estrella", "Star");
        diccionario.put("Comida", "Food");
        diccionario.put("Fruta", "Fruit");
        diccionario.put("Estudiar", "Study");
        diccionario.put("Hola", "Hello");
    	
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a este diccionario, ingresa la palabra que quieres traducir.\nAsegurate de escribirla con la primera letra mayuscula.");
        System.out.println("Si deseas salir del diccionario escribe 'salir'.");

        while (true) {
            String palabraUsuario = sc.nextLine();

            if (diccionario.containsKey(palabraUsuario)) {
                System.out.println(diccionario.get(palabraUsuario));
            } else if(palabraUsuario.equals("salir")){
            	System.out.println("Nos vemos, gracias por utilizar el diccionario.");
            	break;
            } else {
                System.out.println("La palabra no se encuentra en el diccionario, lo siento.");
            }
        }

        sc.close();
    }

}
