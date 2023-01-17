/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Emilio
 */
public class NuevoLaberinto {

    ObtenerLaberinto nxtLab = new ObtenerLaberinto();

    public int[][] pasarNivel(int[][] n) {

        if (n == nxtLab.laberinto1) {

            return nxtLab.laberinto2;
        } else {
            if (n == nxtLab.laberinto2) {

                return nxtLab.laberinto3;
            } else {
                if (n == nxtLab.laberinto3) {

                    return nxtLab.laberinto4;
                } else {
                    return nxtLab.laberinto1;
                }

            }

        }
    }
}