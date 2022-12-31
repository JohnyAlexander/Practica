/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import controlador.tda.lista.ListaEnlazada;
import controlador.tda.lista.exception.EstructuraDataVaciaExpetion;
import controlador.tda.lista.exception.PosicionException;
import javax.swing.table.AbstractTableModel;
import jdk.nashorn.internal.scripts.JO;

/**
 *
 * @author johnny
 */
public class VistaTablas extends AbstractTableModel {

    private ListaEnlazada<String> Datos = new ListaEnlazada<>();

    public ListaEnlazada<String> getDato() {
        return Datos;
    }

    public void setDatos(ListaEnlazada<String> Datos) {
        this.Datos = Datos;
    }

    @Override
    public int getRowCount() {

        return Datos.getSize();
    }

    @Override
    public int getColumnCount() {

        return 2;
    }

    @Override
    public String getColumnName(int columna) {
        switch (columna) {
            case 0:
                return "Posicion";
            case 1:
                return "Datos Ordenados";
            default:
                return null;
        }

    }

    @Override
    public Object getValueAt(int fila, int columna) {
        switch (columna) {
            case 0:
                return fila + 1;
            case 1: {
                try {
                    return (Datos != null) ? Datos.obtenerDato(fila) : "";
                } catch (PosicionException ex) {

                }
            }

            default:
                return null;
        }
    }
}
