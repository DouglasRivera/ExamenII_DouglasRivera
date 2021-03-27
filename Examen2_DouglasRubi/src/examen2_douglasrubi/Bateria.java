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
public class Bateria extends Vehiculos {

    String material;
    int autonomia;

    public Bateria(String material, int autonomia) {
        this.material = material;
        this.autonomia = autonomia;
    }

    public Bateria() {
    }

    public Bateria(String VIN, String Color, Bateria Bateria, String Carroceria, Infoentretenimiento Info, Interior Interior) {
        super(VIN, Color, Bateria, Carroceria, Info, Interior);
    }


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }
}
