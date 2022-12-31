/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author johnny
 */
public class Datos {

    private String Cantidad[] = new String[20000];

    public Datos() {
    }

    /**
     * @return the Cantidad
     */
    public String[] getCantidad() {
        return Cantidad;
    }

    /**
     * @param Cantidad the Cantidad to set
     */
    public void setCantidad(String[] Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String[] randomCadenaTxt() {
        String[] array = {" "};
        for (int i = 0; i < Cantidad.length; i++) {
            Cantidad[i] = String.valueOf((int) (Math.random() * 15 + 5));
            System.out.println("Datos String");
            System.out.println("Random - " + Cantidad[i]);
        }
        return Cantidad;
    }

}
