/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.DatosArray;

import Modelo.Datos;
import controlador.ordenacion.arreglos.Ordenacion;
import controlador.tda.lista.ListaEnlazada;

/**
 *
 * @author johnny
 */
public class ListaDatos {

   private Datos datos;

    public String[] DatosOrdenar(String tipoOrdenacion, String tipo, String[] Arreglo) {
        if (tipoOrdenacion.equalsIgnoreCase("Quicksort")) {
            Arreglo =  Ordenacion.quickSort(Arreglo,0,Arreglo.length-1);
            if (tipo.equalsIgnoreCase("Descendente")) {
                Arreglo= DatosInvertidos(Arreglo);
            }
            return Arreglo;
        } else {
           Arreglo = Ordenacion.ShellSort(Arreglo);
            if (tipo.equalsIgnoreCase("Descendente")) {
                Arreglo = DatosInvertidos(Arreglo);
            }
            return Arreglo;
        }
    }

    private String[] DatosInvertidos(String arreglo[]) {
        String[] array = new String[arreglo.length];
        for (int i = arreglo.length-1, j=0; i >= 0; i--) {
            array[j] = arreglo[i];
            j++;
        }
        return array;
    }
    public Datos getDatos() {
        if (datos == null) {
            datos = new Datos();
        }
        return datos;
    }

    public void setDatos(Datos datos) {
        this.datos = datos;
    }
}
