package ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class MainDiccionario {
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
        
        HashMap<String, String> diccionarioRandom = crearDiccionarioRandom(diccionario);
        
        Scanner scan = new Scanner(System.in);
        
        int correctas = 0;
        int incorrectas = 0;
        
        System.out.println("Bienvenido, te parece probar tus habilidades en ingles.\nTe dare 5 palabras en español y debes ingresar la palabra en ingles.");

        System.out.println("Estas son las 5 palabras, ingresa su traduccion en ingles.");
        for (String palabraEsp : diccionarioRandom.keySet()) {
            System.out.println(palabraEsp);
        }

        for (int i = 0; i < diccionarioRandom.size(); i++) {
            System.out.print("Respuesta " + (i + 1) + ": ");
            String respuestaUsuario = scan.nextLine();

            if (diccionarioRandom.containsValue(respuestaUsuario)) {
                correctas = correctas + 1;
            } else {
                incorrectas = incorrectas + 1;
            }
        }

        System.out.println("Tuviste " + correctas + " respuestas correctas.");
        System.out.println("Tuviste " + incorrectas + " respuestas incorrectas.");
        System.out.println("Gracias por probar el diccionario, hasta luego.");

        scan.close();
    }

    public static HashMap<String, String> crearDiccionarioRandom(HashMap<String, String> diccionario) {
        HashMap<String, String> diccionarioRandom = new HashMap<>();
        ArrayList<String> llavesDelDiccionario = new ArrayList<>();
        Set<String> set = null;
        
        Random random = new Random();
        
        set = diccionario.keySet();
        for (String llave : set) {
        	llavesDelDiccionario.add(llave);
        }
        
        for (int i = 0; i < 5; i++) {
            int posicionAleatoria = random.nextInt(llavesDelDiccionario.size());
            
            String palabraEspaniol = llavesDelDiccionario.remove(posicionAleatoria);
            String palabraIngles = diccionario.remove(palabraEspaniol);
            
            diccionarioRandom.put(palabraEspaniol, palabraIngles);
        }
        
        return diccionarioRandom;
    }
}