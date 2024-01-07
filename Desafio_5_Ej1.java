package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio_5_Ej1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese una oracion: ");
        String nombre = scanner.nextLine();
        while(nombre.isEmpty()){
            System.out.println("La oracion no puede estar vacia, ingresar nuevamente: ");
            nombre = scanner.nextLine();
        }
        String[] arrayNombre = nombre.split(" ");

        Arrays.sort(arrayNombre);
        String arrayParaimprimir = Arrays.toString(arrayNombre);

        ordenarLetrasEnArray(arrayNombre);




        //Punto 1
        System.out.println("La cantidad de palabras son: " + arrayNombre.length);
        //Punto 2
        if(palabrasRepetidas(arrayNombre) == true){
            System.out.println("Hay palabras repetidas");
        }else{
            System.out.println("No hay palabras repetidas");
        }
        //Punto 3
        System.out.println("El array ordenado de forma ascendente es: " + arrayParaimprimir);
        //Punto 4
        System.out.println("El array con las letras ordenadas es: " + Arrays.toString(arrayNombre)); //imprime el array sin necesidad de un for
    }

    public static boolean palabrasRepetidas(String[] array){

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void ordenarLetrasEnArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            char[] chars = array[i].toCharArray();
            Arrays.sort(chars);
            array[i] = new String(chars);
        }
    }

}