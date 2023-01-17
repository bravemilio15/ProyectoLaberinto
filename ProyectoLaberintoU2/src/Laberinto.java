
import java.awt.Color;
import java.awt.Graphics;

public class Laberinto {
    
    ObtenerLaberinto laberintos = new ObtenerLaberinto();
    NuevoLaberinto cambio = new NuevoLaberinto();

    private int fila = 0;
    private int columna = 0;
    private final int nFilas = 13;
    private final int nColumnas = 23;
    private final int anchoBloque = 40;
    private final int altoBloque = 40;

    public void paint(Graphics grafico) {
        int[][] laberinto = cambio.pasarNivel(laberintos.laberinto1);
        
        for(fila=0; fila <nFilas; fila++){
            
            for(columna=0; columna < nColumnas;columna++){
                if(laberinto[fila][columna]==1){//Preguntamos si la posicion es 1  creara un Muro
                    //Rellenar Muros del Laberinto
                    grafico.setColor(Color.green);
                    grafico.fillRect(columna*40, fila*40, anchoBloque, altoBloque);//el *40 Es para agrandar los muros
                    grafico.setColor(Color.black);
                    grafico.drawRect(columna*40, fila*40, anchoBloque, altoBloque);
                    
                }
                    
            }
        }
        
        
    }

    private Juego juegoLaberinto;
    private Personaje llamarLaberinto;

}