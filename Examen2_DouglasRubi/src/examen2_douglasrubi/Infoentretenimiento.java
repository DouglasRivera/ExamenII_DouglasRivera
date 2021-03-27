/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_douglasrubi;

/**
 *
 * @author river
 */
public class Infoentretenimiento extends Vehiculos{
    int cant_pantalla,ancho_pantalla;
    boolean visor;

    public Infoentretenimiento(int cant_pantalla, int ancho_pantalla, boolean visor) {
        this.cant_pantalla = cant_pantalla;
        this.ancho_pantalla = ancho_pantalla;
        this.visor = visor;
    }
    
    public Infoentretenimiento() {
    }

    public Infoentretenimiento(String VIN, String Color, Bateria Bateria, String Carroceria, Infoentretenimiento Info, Interior Interior) {
        super(VIN, Color, Bateria, Carroceria, Info, Interior);
    }
    
    public int getCant_pantalla() {
        return cant_pantalla;
    }

    public void setCant_pantalla(int cant_pantalla) {
        this.cant_pantalla = cant_pantalla;
    }

    public int getAncho_pantalla() {
        return ancho_pantalla;
    }

    public void setAncho_pantalla(int ancho_pantalla) {
        this.ancho_pantalla = ancho_pantalla;
    }

    public boolean isVisor() {
        return visor;
    }

    public void setVisor(boolean visor) {
        this.visor = visor;
    }
}
