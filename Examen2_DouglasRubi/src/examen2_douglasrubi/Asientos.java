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
public class Asientos extends Vehiculos{
    String material,tipo;
    boolean masaje;
    
    public Asientos(String material, String tipo, boolean masaje) {
        this.material = material;
        this.tipo = tipo;
        this.masaje = masaje;
    }
    public Asientos() {
    }

    public Asientos(String VIN, String Color, Bateria Bateria, String Carroceria, Infoentretenimiento Info, Interior Interior) {
        super(VIN, Color, Bateria, Carroceria, Info, Interior);
    }

    
    
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isMasaje() {
        return masaje;
    }

    public void setMasaje(boolean masaje) {
        this.masaje = masaje;
    }
}
