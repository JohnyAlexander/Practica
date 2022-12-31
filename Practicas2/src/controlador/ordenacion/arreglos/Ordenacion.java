/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.ordenacion.arreglos;

/**
 *
 * @author Johnny
 */
public class Ordenacion {

//    public void randomNumber() {
//        String Cantidad[] = new String[10];
//        for (int i = 0; i < Cantidad.length; i++) {
//            Cantidad[i] = String.valueOf((int) (Math.random() * 15 + 5));
//            System.out.println("Random - " + Cantidad[i]);
//        }
//    }
    public static String[] ShellSort(String[] arreglo) {
        for (int salto = arreglo.length / 2; salto > 0; salto /= 2) {
            for (int i = salto; i < arreglo.length; i++) {
                Integer j;
                String aux = arreglo[i];
                for (j = i; j >= salto && arreglo[j - salto].compareTo(aux) > 0; j -= salto) {
                    arreglo[j] = arreglo[j - salto];
                }
                arreglo[j] = aux;
            }
        }
        return arreglo;
    }

    public static String[] quickSort(String[] arreglo, Integer izquierda, Integer derecha) {

        String pivote = arreglo[(izquierda + derecha) / 2];
        Integer i = izquierda, j = derecha;
        while (i <= j) {
            while (arreglo[i].compareTo(pivote) < 0) {
                i++;
            }

            while (pivote.compareTo(arreglo[j]) < 0) {
                j--;
            }
            if (i <= j) {
                String aux = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = aux;
                i++;
                j--;
            }
        }
        if (izquierda < j) {
            quickSort(arreglo, izquierda, j);
        }
        if (i < izquierda) {
            quickSort(arreglo, i, derecha);
        }
        return arreglo;
    }
}
