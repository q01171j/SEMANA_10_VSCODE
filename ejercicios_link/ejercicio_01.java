package ejercicios_link;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio_01 {
    public static void introducirValores(ArrayList <Integer> listaNumeros){
        Scanner teclado = new Scanner(System.in);
        Integer numero;
        System.out.println("Introduce un numero: ");
        do {
            numero = teclado.nextInt();
            listaNumeros.add(numero);
            System.out.println("Introduce otro numero y si quieres salir introduce uno negativo");
        } while (numero >= 0);

        for (int i = 0; i < listaNumeros.size(); i++) {
            if (listaNumeros.get(i) < 0 ) {
                listaNumeros.remove(i);
            }
        }
    }

    public static void mostrarLista(ArrayList <Integer> listaNumeros){
        System.out.println("La lista contiene los siguientes nÃºmeros");
        System.out.println(listaNumeros);
    }

    public static void intercambiarPosiciones(ArrayList <Integer> listaNumeros){
        Integer aux;
        aux = listaNumeros.get(1);
        listaNumeros.set(1, listaNumeros.get(3));
        listaNumeros.set(3, aux);
    }

    public static void main(String[] args) {
        ArrayList <Integer> listaNumeros = new ArrayList <> ();
        introducirValores(listaNumeros);
        mostrarLista(listaNumeros);
        intercambiarPosiciones(listaNumeros);
        mostrarLista(listaNumeros);
    }
}
