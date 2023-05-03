package out.com.JavaAvanzado.Ejercicios.Ejercicios1920y21;

import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        if (args.length < 2 ) {
            System.out.println("Debes ingresar al menos dos números enteros como argumentos.");
        }

        int[] numeros = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            numeros[i] = Integer.parseInt(args[i]);
        }

        Arrays.sort(numeros);

        System.out.println("Numeros ordenados de forma ascendente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
